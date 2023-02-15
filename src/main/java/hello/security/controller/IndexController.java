package hello.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @GetMapping
    public String index(){
        return "index";
    }
    @GetMapping("/user")
    @ResponseBody
    public String user(){
        return "user";
    }
    @GetMapping("/manager")
    @ResponseBody
    public String manager(){
        return "manager";
    }
    @GetMapping("/admin")
    @ResponseBody
    public String admin(){
        return "admin";
    }
    @GetMapping("/join")
    @ResponseBody
    public String join(){
        return "join";
    }
    @GetMapping("/login")
    @ResponseBody
    public String login(){
        return "login";
    }
    @GetMapping("/joinComplete")
    @ResponseBody
    public String joinComplete(){
        return "joinComplete";
    }
}
