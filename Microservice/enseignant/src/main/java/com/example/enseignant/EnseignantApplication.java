package com.example.enseignant;

import com.example.enseignant.configuration.RsaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaConfig.class)
public class EnseignantApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnseignantApplication.class, args);
    }

}
