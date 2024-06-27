package com.idho_web.idho_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Idho.
 * Date: 27/06/2024
 * Time: 21:11
 */

@Controller
public class HomeController {


    @GetMapping("/")
    public String connectionTest() {
        return "index";
    }

}
