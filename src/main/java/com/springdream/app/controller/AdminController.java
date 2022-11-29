package com.springdream.app.controller;

import com.springdream.app.domain.MemberVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/*")
public class AdminController {

    @GetMapping("/main")
    public String main(){
        return "admin/adminPage-main";
    }

    @GetMapping("/userlist")
    public String userList(MemberVO memberVO){
        return "admin/adminPage-userlist";
    }

    @GetMapping("/support")
    public String support(){
        return "admin/adminPage-support";
    }

    @GetMapping("/boards")
    public String boards(){
        return "admin/adminPage-post";
    }

    @GetMapping("/report")
    public String report(){
        return "admin/adminPage-report";
    }
}
