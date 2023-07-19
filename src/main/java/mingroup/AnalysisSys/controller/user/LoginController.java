package mingroup.AnalysisSys.controller.user;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import mingroup.AnalysisSys.entity.User;
import mingroup.AnalysisSys.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    UserMapper userMapper;

    @PostMapping("/login")
    protected User login(@RequestBody User user, HttpServletRequest request) {
        // return a user object if login successfully
        // otherwise return null
        User userFromDB = userMapper.login(user);

        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", userFromDB);
        }
        return userFromDB;
    }
}
