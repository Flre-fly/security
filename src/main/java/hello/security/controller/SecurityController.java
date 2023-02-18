package hello.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("")
public class SecurityController {
    @GetMapping("/")
    public String home(){
        return "root";
    }
    @GetMapping("/user")
    public String user(){
        return "user";
    }
    @GetMapping("/admin/pay")
    public String pay(){
        return "adminPay";
    }
    @GetMapping("/admin/a")
    public String a(){
        return "a";
    }
}
