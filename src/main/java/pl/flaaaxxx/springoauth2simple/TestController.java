package pl.flaaaxxx.springoauth2simple;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;

@RestController
public class TestController {

    @GetMapping("/test1")
    public String test1() {
        return "test1";
    }

    @GetMapping("/test2")
    public String test2() {
        // get user details after authentication
        Object details = ((UsernamePasswordAuthenticationToken)
                ((OAuth2Authentication) ((SecurityContextImpl) SecurityContextHolder
                        .getContext())
                        .getAuthentication())
                        .getUserAuthentication())
                .getDetails();
        String name = ((LinkedHashMap) details).values().toArray()[1].toString();
        String picture = ((LinkedHashMap) details).values().toArray()[4].toString();
        String email = ((LinkedHashMap) details).values().toArray()[5].toString();
        String data = name + " " + email + " " + picture;

        return data;
    }
}
