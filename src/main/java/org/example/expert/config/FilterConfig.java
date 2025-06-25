package org.example.expert.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public JwtFilter jwtFilter(JwtUtil jwtUtil) {
        return new JwtFilter(jwtUtil);
    }
}
