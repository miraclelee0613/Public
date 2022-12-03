package com.springdream.app.controller;

import com.springdream.app.domain.ReportVO;
import com.springdream.app.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/report")
public class ReportController {

    @Qualifier("board")
    private final ReportService reportService;

    @GetMapping("")
    public String main(Model model){
        model.addAttribute("report", new ReportVO());
        return "report/reportPage";
    }

    @PostMapping("")
    public RedirectView main(ReportVO reportVO, RedirectAttributes redirectAttributes) {
        // 테스트용으로 임시 작성, 회원번호 받아와야 함
        reportVO.setMemberNumber(23L);

        // 테스트용으로 임시 작성, 게시글 번호 받아와야 함
        reportVO.setBoardNumber(14L);

        reportService.register(reportVO);
        return new RedirectView("/main/index");
    }
}
