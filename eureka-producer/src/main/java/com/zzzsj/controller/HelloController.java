package com.zzzsj.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author 79282
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/username")
    public String hello(@RequestParam String name) {
        return "hello" + name + " " + new Date();
    }

}
