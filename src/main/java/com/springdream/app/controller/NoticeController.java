package com.springdream.app.controller;

import com.springdream.app.service.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/notice/*")
public class NoticeController {
    private final NoticeService noticeService;

    @GetMapping("/all")
    public String noticeAll() {
        return "/notice/notice-all";
    }

    @PostMapping("/all")
    public String noticeAll(Model model) {
        return "notice/notice-all";
    }

    @GetMapping("/recent")
    public String noticeRecent(Long boardNumber, Model model){
        model.addAttribute("notice", noticeService.show(boardNumber));
        return "/notice/notice-recent";
    }
}
