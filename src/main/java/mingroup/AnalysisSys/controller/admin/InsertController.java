package mingroup.AnalysisSys.controller.admin;

import mingroup.AnalysisSys.entity.User;
import mingroup.AnalysisSys.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class InsertController {
    @Autowired
    UserMapper userMapper;

    @PostMapping("/insert/user")
    public boolean insertUser(@RequestBody User user) {
        // if grade property is not specified, the default value equals to 0
        return userMapper.insertUser(user);
    }
}
