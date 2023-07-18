package mingroup.AnalysisSys.controller.admin;

import mingroup.AnalysisSys.entity.*;
import mingroup.AnalysisSys.mapper.*;
import mingroup.AnalysisSys.repository.CollegeMajorRepository;
import mingroup.AnalysisSys.utils.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class QueryController {
    @Autowired
    UserMapper userMapper;

    @Autowired
    CollegeMapper collegeMapper;

    @Autowired
    CollegeMajorRepository collegeMajorRepository;

    @Autowired
    MajorInfoMapper majorInfoMapper;

    @Autowired
    MajorMapper majorMapper;

    @Autowired
    MajorEnrollMapper majorEnrollMapper;

    @GetMapping("/query/users")
    protected List<User> queryUsers() {
        return userMapper.findAll();
    }

    @GetMapping("/query/user")
    protected User queryUser(String userName) {
        return userMapper.findByUserName(userName);
    }

    @GetMapping("/query/colleges")
    protected List<College> queryColleges() {
        return collegeMapper.findAll();
    }

    @GetMapping("/query/colleges-and-majors")
    protected List<CollegeMajor> queryCollegesAndMajors() {
        return collegeMajorRepository.findAll();
    }

    @GetMapping("/query/best-match-college")
    protected College queryBestMatchCollege(String userName) {
        User user = userMapper.findByUserName(userName);
        List<College> colleges = collegeMapper.findAll();

        College dest = null;
        float maxn = 0;

        String desMajor = user.getDesMajor();
        int desMajorID = majorMapper.getMajorByName(desMajor).getMajorID();
        String desProvince = user.getDesProvince();
        String desCollege = user.getDesCollege();
        String sex = user.getSex();
        float grade = user.getGrade();
        int year = Const.YEAR.getValue();
        int counter = 0;

        for (int k = 0; k < colleges.size(); ++k) {

            College college = colleges.get(k);

            float temp = 0;

            if (!college.getCollegeName().isEmpty() && college.getCollegeName().equals(desCollege)) {
                temp += 40;
            }

            if (!college.getProvince().isEmpty() && college.getProvince().equals(desProvince)) {
                temp += 20;
            }

            int collegeId = college.getCollegeId();

            // major level equals to A or A+
            for(MajorInfo majorInfo : majorInfoMapper.findByCollegeID(collegeId)) {
                if(!majorInfo.getLevel().isEmpty() && (majorInfo.getLevel().equals("A") || majorInfo.getLevel().equals("A+"))) {
                    temp += 20;
                    break;
                }
            }

            if(sex.equals("男") && college.getSexRatio() != 0.0 && college.getSexRatio() < 1) {
                temp += 5;
            } else if(sex.equals("女") && college.getSexRatio() > 1) {
                temp += 5;
            }
            if(college.getEmployRate() != 0.0) {
                temp += college.getEmployRate() * 25;
            }
            if(college.getDer() != 0.0) {
                temp += college.getDer() * 40;
            }
            if(college.getOer() != 0.0) {
                temp += college.getOer() * 40;
            }

            List< MajorEnroll> majorEnrolls = majorEnrollMapper.getAverageAdmissionScoreRecentThreeYears(
                    college.getCollegeId(),
                    desMajorID,
                    year-1,
                    year-2,
                    year-3
            );

            float averageScore = 0;
            for(MajorEnroll majorEnroll : majorEnrolls) {
                averageScore += majorEnroll.getMajorGrade();
            }

            averageScore /= majorEnrolls.size();

            temp = temp * (1 - (averageScore-grade)/50);


            if(temp > maxn) {
                maxn = temp;
                counter = k;
            }

        }
        return colleges.get(counter);
    }

    @GetMapping("/query/find-feedback-by-user-name")
    protected List<Feedback> findFeedbackByUserName(String userName) {
        return userMapper.findFeedbackByUserName(userName);
    }
}
