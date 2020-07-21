package com.codechii;

import com.codechii.entity.ThemeParkRide;
import com.codechii.repository.ThemeParkRideRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ThemeParkApplication {
    public static void main(String[] args) {
        SpringApplication.run(ThemeParkApplication.class);
    }

    @Bean
    public CommandLineRunner sampleData(ThemeParkRideRepository repo) {
        return (args) -> {
            repo.save(new ThemeParkRide("Roolercoaster", "Fuckin hell", 4, 2));
            repo.save(new ThemeParkRide("Log flume", "Boat ride with plenty of splashes", 5, 7));
            repo.save(new ThemeParkRide("Teacups", "My ass is on fire", 8, 10));
        };
    }
}
