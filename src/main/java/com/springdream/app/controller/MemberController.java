package com.springdream.app.controller;

import com.springdream.app.domain.MemberVO;
import com.springdream.app.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member/*")
public class MemberController {

    //    회원가입
    @GetMapping("/join")
    public String join() {
        return "member/join.html";
    }

    //    회원가입성공
//    @PostMapping("/joinOk")
//    public RedirectView joinOk(MemberVO memberVO, RedirectAttributes redirectAttributes){
//        MemberService.register(memberVO);
//        redirectAttributes.addFlashAttribute("memberNumber", memberVO.getMemberNumber());
//        return new RedirectView("/member/login");
//    }

    //    아이디 중복 체크
//    @PostMapping("/checkId")
//    public RedirectView checkId(MemberVO memberVO, RedirectAttributes redirectAttributes){
//        MemberService.register(memberVO);
////        redirectAttributes.addFlashAttribute("boardNumber", boardDTO.getBoardNumber());
//        return new RedirectView("/member/join");
//    }

    //    로그인
    @GetMapping("/login")
    public String login() {
        return "member/login.html";
    }

    //    로그인성공
//    @LogStatus
//    @PostMapping("/loginOk")
//    public RedirectView loginOk(MemberVO memberVO, RedirectAttributes redirectAttributes){
//        MemberService.register(memberVO);
////        redirectAttributes.addFlashAttribute("boardNumber", boardDTO.getBoardNumber());
//        return new RedirectView("main/index");
//    }

    //    마이페이지 내 정보 수정
    @GetMapping("/myinfo")
    public String myinfo() {
        return "mypage/mypage_info.html";
    }
//    @LogStatus
//    @PostMapping("/update")
//    public RedirectView update(BoardDTO boardDTO, RedirectAttributes redirectAttributes){
//        boardService.modify(boardDTO);
//        redirectAttributes.addAttribute("boardNumber", boardDTO.getBoardNumber());
//        return new RedirectView("/board/read");
//    }


    //    마이페이지 나의 글 목록
    @GetMapping("/myboard")
    public String myboard() {
        return "mypage/mypage_boards.html";
    }
//    @LogStatus
//    @GetMapping("/list")
//    public void list(Criteria criteria, Model model){
//        if(criteria.getPage() == 0){
//            criteria.create(1, 10);
//        }
//        model.addAttribute("boards", boardService.showAll(criteria));
//        model.addAttribute("pagination",new PageDTO().createPageDTO(criteria, boardService.getTotal()));
//    }

    //    마이페이지 나의 답글 목록
    @GetMapping("/myreply")
    public String myreply() {
        return "mypage/mypage_reply.html";
    }
//    @LogStatus
//    @GetMapping("/list")
//    public void list(Criteria criteria, Model model){
//        if(criteria.getPage() == 0){
//            criteria.create(1, 10);
//        }
//        model.addAttribute("boards", boardService.showAll(criteria));
//        model.addAttribute("pagination",new PageDTO().createPageDTO(criteria, boardService.getTotal()));
//    }

    //    마이페이지 내 포인트
    @GetMapping("/mypoints")
    public String mypoints() {
        return "mypage/mypage_points.html";
    }
//    @LogStatus
//    @GetMapping("/list")
//    public void list(Criteria criteria, Model model){
//        if(criteria.getPage() == 0){
//            criteria.create(1, 10);
//        }
//        model.addAttribute("boards", boardService.showAll(criteria));
//        model.addAttribute("pagination",new PageDTO().createPageDTO(criteria, boardService.getTotal()));
//    }

    //    마이페이지 충전내역 확인
    @GetMapping("/mycash")
    public String mycash() {
        return "mypage/mypage_cash.html";
    }
//    @LogStatus
//    @GetMapping("/list")
//    public void list(Criteria criteria, Model model){
//        if(criteria.getPage() == 0){
//            criteria.create(1, 10);
//        }
//        model.addAttribute("boards", boardService.showAll(criteria));
//        model.addAttribute("pagination",new PageDTO().createPageDTO(criteria, boardService.getTotal()));
//    }


}


