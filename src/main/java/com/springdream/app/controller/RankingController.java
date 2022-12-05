package com.springdream.app.controller;

import com.springdream.app.domain.PointDTO;
import com.springdream.app.domain.PointVO;
import com.springdream.app.service.PointRankingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/point/*")
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
//    @PostMapping("/list")
//    public RedirectView rankingListCtrl(PointVO pointVO){
//        pointRankingService.rankingListService(pointVO);
//        return new RedirectView("/point/point-ranking");
//    }

//    누적포인트 랭킹
    @GetMapping("/point-ranking")
    public void totalPointRank(Model model){
        List<PointDTO> p = pointRankingService.rankingListService();
        model.addAttribute("userRankInfo", p);
    }

//    채택 랭킹
//    @GetMapping("/point-ranking")
//    public void adoptCountRank(Model model){
//        List<PointDTO> p = pointRankingService.
//    }



}

