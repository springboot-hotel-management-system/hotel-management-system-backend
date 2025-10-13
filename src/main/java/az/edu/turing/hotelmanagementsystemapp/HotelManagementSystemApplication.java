package az.edu.turing.hotelmanagementsystemapp;


import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotelManagementSystemApplication {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();

        // System properties kimi Spring üçün əlavə edirik
        System.setProperty("DATABASE_URL", dotenv.get("DATABASE_URL"));
        System.setProperty("DATABASE_USERNAME", dotenv.get("DATABASE_USERNAME"));
        System.setProperty("DATABASE_PASSWORD", dotenv.get("DATABASE_PASSWORD"));
    SpringApplication.run(HotelManagementSystemApplication.class, args);
    }
    }


