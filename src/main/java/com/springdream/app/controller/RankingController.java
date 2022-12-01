package com.springdream.app.controller;

import com.springdream.app.service.PointService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/ranking/*")
public class RankingController {
//    private final PointService pointService;

    //  랭킹 목록
    @PostMapping("/list")
    public String list() {
        return "point/point-ranking.html";
        }

    //  게시글 목록
//    @GetMapping("/boardMain")
//    public void main(Model model) {
//        model.addAttribute("boards", boardService.showAll());
//    }
}

