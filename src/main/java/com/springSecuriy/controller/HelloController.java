package com.springSecuriy.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jonah
 * @date 2023/5/4 8:59
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    @PreAuthorize("hasAnyAuthority('system:dept:list')")
    public String hello(){
        return "hello";
    }
}
