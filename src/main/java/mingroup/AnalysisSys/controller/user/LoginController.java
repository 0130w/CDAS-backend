package mingroup.AnalysisSys.controller.user;


import mingroup.AnalysisSys.entity.User;
import mingroup.AnalysisSys.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/login")
    protected User login(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        // return a user object if login successfully
        // otherwise return null
        return userMapper.login(userName, password);
    }


}
