package com.springdream.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
@RequestMapping("/main/*")
public class MainController {

    @GetMapping("index")
    public String index(Model model, HttpServletRequest request){
        if(request.getSession().getAttribute("memberNumber") == null){
            return "main/index";
        } else {
            model.addAttribute("loginOK", true);
        }
        return "main/index";
    }

    @GetMapping("searchResult")
    public String search(){
        return "fix/searchResult";
    }

}
