package ma.cigma;

import io.jsonwebtoken.Claims;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.client.RestTemplate;

import static ma.cigma.config.security.JWTDemo.createJWT;
import static ma.cigma.config.security.JWTDemo.decodeJWT;

@SpringBootApplication
public class FrontEnd0Application {
    public static void main(String[] args) {





        SpringApplication.run(FrontEnd0Application.class, args);
    }
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public PasswordEncoder getP(){
        return new BCryptPasswordEncoder();
    }
}
