package hello.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("")
public class SecurityController {
    @GetMapping
    public String home(){
        return "root";
    }
}