package com.example.chercheur;

import com.example.chercheur.configuration.RsaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaConfig.class)

public class ChercheurApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChercheurApplication.class, args);
    }

}
