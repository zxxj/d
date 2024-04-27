package com.itheima.reggie.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Slf4j
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {
    /**
     * 设置静态资源映射
     * @param registry
     */

    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        log.info("开始进行静态资源映射...");
        registry.addResourceHandler("/backend/**").addResourceLocations("classpath:/backend/");
        registry.addResou{
            log.info("开始进行静态资源映射...");
            registry.addResourceHandler("/backend/**").addResourceLocations("classpath:/backend/");
            registry.addResourceHandler("/front/**").addResourceLocations("classpath:/front/");
        }rceHandler("/front/**").addResourceLocations("classpath:/front/");
    }
}