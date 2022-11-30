package com.springdream.app.controller;

import com.springdream.app.domain.Criteria;
import com.springdream.app.service.RankingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/ranking")
public class RankingController {
    private final RankingService rankingService;

    //    랭킹 목록
    @GetMapping("/list")
    public void list(Criteria criteria, Model model) {
        if(criteria.getPage() == 0){
            criteria.create(1, 10);
        }
        model.addAttribute("rankings", rankingService.showAll(criteria));
//        showAll(criteria)
    }
}
