package com.springdream.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/report")
public class ReportController {

    @GetMapping("")
    public String main(){
        return "report/reportPage";
    }
}
