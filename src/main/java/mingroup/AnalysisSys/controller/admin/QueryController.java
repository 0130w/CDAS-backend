package mingroup.AnalysisSys.controller.admin;

import mingroup.AnalysisSys.entity.College;
import mingroup.AnalysisSys.entity.CollegeMajor;
import mingroup.AnalysisSys.entity.User;
import mingroup.AnalysisSys.mapper.CollegeMapper;
import mingroup.AnalysisSys.mapper.UserMapper;
import mingroup.AnalysisSys.repository.CollegeMajorRepository;
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
}
