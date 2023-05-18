package com.springSecuriy.controller;

import com.springSecuriy.domain.ResponseResult;
import com.springSecuriy.domain.User;
import com.springSecuriy.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Jonah
 * @date 2023/5/4 14:38
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/user/login")
    public ResponseResult login(@RequestBody User user) {
        ResponseResult login = loginService.login(user);
//        System.out.println("login.getCode() = " + login.getCode());
        return login;
    }

    @RequestMapping("/user/logout")
    public ResponseResult logout() {
        return loginService.logout();
    }
}
