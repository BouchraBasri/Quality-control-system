package com.example.Quality_control_system.Quality_control_system.Config;

import com.example.Quality_control_system.Quality_control_system.Repository.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProduitConfig {
    @Bean
    CommandLineRunner commandLineRunner(ProduitRepository repository) {
        return args -> {

        };
    }
}
