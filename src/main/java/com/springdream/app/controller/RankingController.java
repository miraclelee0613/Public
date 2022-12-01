package com.springdream.app.controller;

import com.springdream.app.domain.Criteria;
import com.springdream.app.service.PointService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/ranking/*")
public class RankingController {
    private final PointService pointService;

    //  랭킹 목록
    @GetMapping("/point-ranking")
    public void list(Criteria criteria, Model model) {
        if(criteria.getPage() == 0){
            criteria.create(1, 5);
        }
        model.addAttribute("points", pointService.list(criteria));
//        model.addAttribute("pagination",new PageDTO().createPageDTO(criteria, boardService.getTotal()));
    }

}

