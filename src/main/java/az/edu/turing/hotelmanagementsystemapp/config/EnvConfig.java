package az.edu.turing.hotelmanagementsystemapp.config;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnvConfig {

    @Bean
    @ConditionalOnProperty(name = "spring.profiles.active", havingValue = "local", matchIfMissing = true)
    public Dotenv dotenv() {
        return Dotenv.configure()
                .ignoreIfMalformed()
                .ignoreIfMissing()
                .load();
    }
}
