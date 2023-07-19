package mingroup.AnalysisSys.controller.session;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Enumeration;

@RestController
@CrossOrigin
public class SessionController {
    @GetMapping("/session/check-login")
    public boolean getSessionAttributes(HttpSession session) {
        return session.getAttribute("user") != null;
    }
}
