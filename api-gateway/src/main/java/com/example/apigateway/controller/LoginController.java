package com.example.apigateway.controller;


import com.example.apigateway.util.JwtTokenUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class LoginController {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

/*    private AuthenticationManagerBuilder authenticationManagerBuilder;

    public LoginController(JwtTokenUtil jwtTokenUtil, AuthenticationManagerBuilder authenticationManagerBuilder) {
        this.jwtTokenUtil = jwtTokenUtil;
        this.authenticationManagerBuilder = authenticationManagerBuilder;*/


    @GetMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        //用户验证
        Authentication authenticationToken =
                new UsernamePasswordAuthenticationToken(username,password);
        //存储认证信息
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        String token = jwtTokenUtil.generateToken(authenticationToken);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", "Bearer " + token);
        return token;
    }
}
