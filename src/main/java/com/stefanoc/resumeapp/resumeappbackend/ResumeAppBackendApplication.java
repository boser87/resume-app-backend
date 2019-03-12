package com.stefanoc.resumeapp.resumeappbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@SpringBootApplication
public class ResumeAppBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResumeAppBackendApplication.class, args);
    }

    @Configuration
    public class GlobalRepositoryRestConfigurer implements RepositoryRestConfigurer {

        @Override
        public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
            config.getCorsRegistry()
                    .addMapping("/resumes/**")
                    .allowedMethods("*")
                    .allowedOrigins("http://localhost:9000", "http://localhost:9001");
        }

    }
}
