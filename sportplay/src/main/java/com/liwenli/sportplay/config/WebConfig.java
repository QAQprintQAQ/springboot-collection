package com.liwenli.sportplay.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置跨域请求
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        /**
         * 1.域名访问路径
         * 2.请求来源
         * 3.方法
         * 4.允许携带token等信息
         * 5.最大生命周期时间
         */
        registry.addMapping("/**")
                .allowedOrigins("Http://localhost:8080", "null")
                .allowedMethods("GET", "POST", "PUT", "OPTIONS", "DELETE", "HEAD")
                .allowCredentials(true)
                .maxAge(3600);
    }
}
