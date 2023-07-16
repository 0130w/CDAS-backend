package mingroup.AnalysisSys.config;

import mingroup.AnalysisSys.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // currently LoginInterceptor is only used for user
        // registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/user/**");
    }
}
