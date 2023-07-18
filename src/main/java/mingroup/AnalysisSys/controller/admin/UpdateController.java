package mingroup.AnalysisSys.controller.admin;

import mingroup.AnalysisSys.entity.Feedback;
import mingroup.AnalysisSys.entity.User;
import mingroup.AnalysisSys.mapper.CollegeMapper;
import mingroup.AnalysisSys.mapper.FeedbackMapper;
import mingroup.AnalysisSys.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UpdateController {
    @Autowired
    CollegeMapper collegeMapper;

    @Autowired
    UserMapper userMapper;

    @Autowired
    FeedbackMapper feedbackMapper;

    @GetMapping("/update/college-update-display-ad")
    protected boolean updateCollegeDisplayAd(String collegeName, boolean displayAd) {
        return collegeMapper.updateDisplayAd(collegeName, displayAd);
    }

    @GetMapping("/delete/user")
    protected boolean deleteUser(String userName) {
        return userMapper.deleteUser(userName);
    }

    @PostMapping("/insert/feedback")
    protected boolean insertFeedback(@RequestBody Feedback feedback) {
        return feedbackMapper.insertFeedback(feedback.getUserName(), feedback.getFeedback());
    }

    @PostMapping("/update/user")
    protected boolean updateUser(@RequestBody User user) {
        return userMapper.updateUser(user.getUserName(), user.getPassword(), user.getSex(), user.getGrade(), user.getProvinceName(), user.getDesMajor(), user.getDesProvince(), user.getDesCollege());
    }
}
