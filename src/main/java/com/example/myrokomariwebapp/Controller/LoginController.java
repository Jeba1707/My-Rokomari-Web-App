package com.example.myrokomariwebapp.Controller;

import com.example.myrokomariwebapp.Domain.LoginReq;
import org.springframework.http.server.DelegatingServerHttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String loginForm(LoginReq loginReq, Model model){
        model.addAttribute("loginReq", loginReq);
        return "index.html";
    }

    @PostMapping("/afterLogin")
    public String afterLogin(LoginReq loginReq,Model model){
        if(loginReq.getUsername().equals("admin") && loginReq.getPassword().equals("1234"))
            return "LoginSuccessfull.html";
            else
                return "LoginError.html";
        }
    }


