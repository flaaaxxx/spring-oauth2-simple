package pl.flaaaxxx.springoauth2simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
//@CrossOrigin(origins = "https://github.com/login/oauth/authorize")
public class SpringOauth2SimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringOauth2SimpleApplication.class, args);
    }

}
