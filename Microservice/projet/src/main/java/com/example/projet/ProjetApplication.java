package com.example.projet;

import com.example.projet.configuration.RsaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaConfig.class)
public class ProjetApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetApplication.class, args);
    }

}
