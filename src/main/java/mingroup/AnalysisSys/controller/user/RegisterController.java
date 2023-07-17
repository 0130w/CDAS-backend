package mingroup.AnalysisSys.controller.user;

import mingroup.AnalysisSys.entity.User;
import mingroup.AnalysisSys.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RegisterController {
    @Autowired
    UserMapper userMapper;

    @PostMapping("/register")
    public boolean register(@RequestBody User user) {
        // if grade property is not specified, the default value equals to 0
        return userMapper.insertUser(user);
    }
}
