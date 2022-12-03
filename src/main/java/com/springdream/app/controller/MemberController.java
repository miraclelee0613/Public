package com.springdream.app.controller;

import com.springdream.app.domain.MemberVO;
import com.springdream.app.service.MainMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member/*")
public class MemberController {

    private final MainMemberService memberService;

    //    회원가입
    @GetMapping("/join")
    public String join() {
        return "member/join.html";
    }
    @PostMapping("/join")
    public String join(MemberVO member) throws Exception {
        memberService.register(member);
        return "member/login.html";
    }

    //    아이디 중복 체크
//    @PostMapping("/checkId")
//    public String checkId(String memberId) throws Exception{
//        memberService.checkId(memberId);
//        return null;
//    }
//    @GetMapping("/checkId_sample")
//    public void checkId_sample(MemberVO memberVO) throws JSONException {
//
//        //String resultVal = String.valueOf();
//        //model.addAttribute("checkId", resultVal);
//
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("checkId", memberService.checkId(memberVO.getMemberId()));
//        //return resultVal;
//    }

    //    로그인
    @GetMapping("/login")
    public String login() {
        return "member/login.html";
    }

    @PostMapping("/login")
    public RedirectView login(MemberVO memberVO, HttpServletRequest request) throws Exception {
        int memberNumber = memberService.login(memberVO);

        // 로그인 실패
        if(memberNumber == 0){
            return new RedirectView("/main/login");
        } else {
            // 로그인 성공
            HttpSession session = request.getSession();
            session.setAttribute("memberNumber", memberNumber);
        }
        return new RedirectView("/main/index");
    }

    //    마이페이지 내 정보 수정
    @GetMapping("/myinfo")
    public String myinfo() {
        return "mypage/mypage_info";
    }
//    @LogStatus
//    @PostMapping("/update")
//    public RedirectView update(BoardDTO boardDTO, RedirectAttributes redirectAttributes){
//        boardService.modify(boardDTO);
//        redirectAttributes.addFlashAttribute("boardNumber", boardDTO.getBoardNumber());
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