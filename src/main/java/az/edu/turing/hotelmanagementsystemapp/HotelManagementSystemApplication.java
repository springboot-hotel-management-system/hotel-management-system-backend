package az.edu.turing.hotelmanagementsystemapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotelManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(HotelManagementSystemApplication.class);

        // Local profili aktiv et
        app.setAdditionalProfiles("local");

        app.run(args);
    }
}
