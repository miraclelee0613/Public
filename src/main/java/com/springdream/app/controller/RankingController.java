package com.springdream.app.controller;

import com.springdream.app.domain.PointVO;
import com.springdream.app.service.PointRankingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/ranking/*")
public class RankingController {
    private final PointRankingService pointRankingService;

//    //  랭킹 리스트
//    @GetMapping("/point-ranking")
//    public void list(Criteria criteria, Model model) {
//        if(criteria.getPage() == 0){
//            criteria.create(1, 5);
//        }
//        model.addAttribute("points", pointService.list(criteria));
////        model.addAttribute("pagination",new PageDTO().createPageDTO(criteria, boardService.getTotal()));
//    }

//    랭킹 리스트
    @PostMapping("/list")
    public RedirectView rankingListCtrl(PointVO pointVO){
        pointRankingService.rankingListService(pointVO);
        return new RedirectView("/ranking/list");
    }





}

