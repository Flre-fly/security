package hello.security.controller;

import hello.security.model.User;
import hello.security.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class IndexController {
    private final UserRepository userRepository;
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
    @GetMapping("/joinForm")
    public String joinForm(){
        return "joinForm";
    }
    @PostMapping("/join")
    @ResponseBody
    public String join(@ModelAttribute User user){
        user.setRole("ROLE_USER");
        userRepository.save(user);
        return "join";
    }
    @GetMapping("/login")
    public String login(){
        return "loginForm";
    }
    @GetMapping("/loginComplete")
    @ResponseBody
    public String loginComplete(){
        return "loginComplete";
    }
}
