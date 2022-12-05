package com.springdream.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
@RequestMapping("/main/*")
public class MainController {

    @GetMapping("index")
    public String index(@CookieValue(name = "memberNumber", required = false) String memberNumber , Model model, HttpServletRequest request){

        model.addAttribute("memberNumber", request.getSession().getAttribute("memberNumber"));

        if(memberNumber != null){
            model.addAttribute("memberNumber", Integer.valueOf(memberNumber));
        }

        return "main/index";
    }

    @GetMapping("searchResult")
    public String search(){
        return "fix/searchResult";
    }

}
