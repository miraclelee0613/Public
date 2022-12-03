package com.springdream.app.controller;

import com.springdream.app.domain.MemberDTO;
//import com.springdream.app.service.AdminReportService;
import com.springdream.app.service.BoardService;
import com.springdream.app.service.AdminMemberService;
import com.springdream.app.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/*")
public class AdminController {

//    private final AdminReportService adminreportService;

    private final BoardService boardService;
    private final AdminMemberService adminMemberService;


    @GetMapping("main")
    public String main(Model model){
        // 관리자 계정인지 검사 필요
        model.addAttribute("newMembers", adminMemberService.newMembers(10));
        return "admin/adminPage-main";
    }

    // 유저 리스트
    @GetMapping("userlist")
    public String userList(Model model){
        int totalMemberCount = adminMemberService.selectAllDTO().size();
        model.addAttribute("members", adminMemberService.selectAllDTO());
        model.addAttribute("memberTotal", totalMemberCount);
        return "admin/adminPage-userlist";
    }

//    @PostMapping("userlist")
//    public String userList(HttpRequest request, Model model){
//        int totalMemberCount = adminMemberService.selectAllDTO().size();
//        model.addAttribute("members", adminMemberService.selectAllDTO());
//        model.addAttribute("memberTotal", totalMemberCount);
//        return "admin/adminPage-userlist";
//    }

    // 게시글 목록
    @GetMapping("boards")
    public String boards(Model model){
        int totalBoardCount = boardService.showAll().size();
        model.addAttribute("boards", boardService.showAll());
        model.addAttribute("totalBoardCount", totalBoardCount);
        return "admin/adminPage-post";
    }

    @GetMapping("report")
    public String report(Model model){
//        model.addAttribute("reports", adminreportService.showAll());
        return "admin/adminPage-report";
    }
}
