package mingroup.AnalysisSys.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        // if user is not logged in, redirect to login page

        if ("/login".equals(request.getRequestURI())) {
            return true;
        }

        if (request.getSession() == null || request.getSession().getAttribute("user") == null) {
            try {
                response.sendRedirect("/login");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        }
        return true;
    }
}
