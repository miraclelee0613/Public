package com.springdream.app.controller;

import com.springdream.app.domain.MemberVO;
import com.springdream.app.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/*")
public class AdminController {

    private final BoardService boardService;

    @GetMapping("/main")
    public String main(){
        return "admin/adminPage-main";
    }

    // 유저 리스트
    @GetMapping("/userlist")
    public String userList(MemberVO memberVO){
        return "admin/adminPage-userlist";
    }

    @GetMapping("/support")
    public String support(){
        return "admin/adminPage-support";
    }

    // 게시글 목록
    @GetMapping("/boards")
    public String boards(Model model){
        int totalBoardCount = boardService.showAll().size();
        model.addAttribute("boards", boardService.showAll());
        model.addAttribute("totalBoardCount", totalBoardCount);
        return "admin/adminPage-post";
    }

    @GetMapping("/report")
    public String report(){
        return "admin/adminPage-report";
    }
}
