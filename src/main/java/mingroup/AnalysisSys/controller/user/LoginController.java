package mingroup.AnalysisSys.controller.user;


import mingroup.AnalysisSys.entity.User;
import mingroup.AnalysisSys.mapper.CollegeMapper;
import mingroup.AnalysisSys.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/login")
    protected List<User> findAll() {
        return userMapper.findAll();
    }


}
