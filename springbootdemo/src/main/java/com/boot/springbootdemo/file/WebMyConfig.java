package com.boot.springbootdemo.file;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @outhor shkstart
 * @create 2019-09-12 14:33
 */
@Configuration
public class WebMyConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //super.addViewControllers(registry);

        registry.addViewController("/").setViewName("test");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
         //注册拦截器
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/login","/test");
    }

}
