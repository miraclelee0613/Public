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

    //  누적포인트 랭킹
    @GetMapping("/point-ranking")
    public void totalPointRank(Model model){
        List<PointDTO> p = pointRankingService.rankingListService();
        model.addAttribute("userPointRank", p);
    }

    //  답변 수 랭킹

    //  채택 랭킹
    @GetMapping("/adopt-ranking")
    public void adoptCountRank(Model model){
        List<PointDTO> p = pointRankingService.countAdoptService();
        model.addAttribute("userAdoptRank", p);
    }



}

