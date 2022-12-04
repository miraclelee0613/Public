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

    @GetMapping("all")
    public String noticeAll() {
        return "notice/notice-all.html";
    }

    @PostMapping("all")
    public String noticeAll(Model model) {
        return "notice/notice-all.html";
    }

    @PostMapping("recent")
    public String noticeRecent() {
        return "notice/notice-recent.html";
    }
}
