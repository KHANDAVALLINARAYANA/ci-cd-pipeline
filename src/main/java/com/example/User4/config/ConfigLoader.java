package com.example.User4.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({
        DatabaseProperties.class,
        ServerProperties.class,
        LoggingProperties.class
})
public class ConfigLoader {
}