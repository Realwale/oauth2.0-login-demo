package net.walecode.springbootoauth2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class OauthController {

    @GetMapping("/")
    public String homePage(){
        return "Welcome to homepage";
    }


    @GetMapping("/oauth-page")
    public String securedPage(){
        return "Here is secured. If you're here then you've been authorized!";
    }
}
