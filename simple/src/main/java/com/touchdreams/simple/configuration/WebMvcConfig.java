package com.touchdreams.simple.configuration;

import com.touchdreams.simple.interceptor.AInterceptor;
import com.touchdreams.simple.interceptor.BInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created by jyh on 2020/3/20.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AInterceptor()).addPathPatterns("/**").excludePathPatterns("/test");
        registry.addInterceptor(new BInterceptor()).addPathPatterns("/**").excludePathPatterns("/test");
        super.addInterceptors(registry);
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
    }

    @Override
    protected void configureViewResolvers(ViewResolverRegistry registry) {
        super.configureViewResolvers(registry);
    }
}
