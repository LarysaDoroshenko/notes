package com.example.notes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods(
                                HttpMethod.GET.toString(),
                                HttpMethod.POST.toString(),
                                HttpMethod.PUT.toString(),
                                HttpMethod.DELETE.toString(),
                                HttpMethod.OPTIONS.toString(),
                                HttpMethod.PATCH.toString()
                        );
            }
        };
    }

}
