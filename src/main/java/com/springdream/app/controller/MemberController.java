package com.springdream.app.controller;

import com.springdream.app.domain.MemberVO;
import com.springdream.app.mapper.MemberMapper;
import com.springdream.app.repository.BoardDAO;
import com.springdream.app.service.BoardService;
import com.springdream.app.service.MainMemberService;
import com.springdream.app.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
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
    private final BoardService boardService;
    private final ReplyService replyService;


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
        String url = "/main/index";
        // 로그인 실패
        if(memberNumber == 0){
            url = "/member/login";
        } else {
            // 로그인 성공
            HttpSession session = request.getSession();
            session.setAttribute("memberNumber", memberNumber);
        }
        return new RedirectView(url);
    }

    //    로그아웃
    @PostMapping("/logout")
    public ModelAndView logout(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.removeAttribute("memberNumber");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/member/login");
        mav.addObject("msg", "logout");
        return mav;
    }

    //    마이페이지 내 정보 수정
    @GetMapping("/myinfo")
    public String myinfo(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        if(session.getAttribute("memberNumber") == null){
            return "main/index";
        } else {
            int memberNumber = (Integer) session.getAttribute("memberNumber");
            MemberVO memberVO = memberService.select(Long.parseLong(String.valueOf(memberNumber)));
            model.addAttribute("memberVO",memberVO);
            return "mypage/mypage_info";
        }
    }
    @PostMapping("/myinfo")
    public String myinfo(MemberVO memberVO, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        int memberNumber = (Integer) session.getAttribute("memberNumber");
        memberVO.setMemberNumber(Long.parseLong(String.valueOf(memberNumber)));
        memberService.modify(memberVO);
        return "mypage/mypage_info";
    }

    //    마이페이지 나의 글 목록
    @GetMapping("/myboard")
    public String myboard(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        if(session.getAttribute("memberNumber") == null){
            return "main/index";
        } else {
            int memberNumber = (Integer) session.getAttribute("memberNumber");
            MemberVO memberVO = memberService.select(Long.parseLong(String.valueOf(memberNumber)));
            model.addAttribute("memberVO",memberVO);
            return "mypage/mypage_boards.html";
        }
    }
    @PostMapping("/myboard")
    public void popular(Model model, Long memberNumber) {
        model.addAttribute("selectMemberBoardAll", boardService.showMemberBoardAll(memberNumber));
    }





    //    마이페이지 나의 답글 목록
    @GetMapping("/myreply")
    public String myreply(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        int memberNumber = (Integer) session.getAttribute("memberNumber");
        MemberVO memberVO = memberService.select(Long.parseLong(String.valueOf(memberNumber)));
        model.addAttribute("memberVO",memberVO);
        return "mypage/mypage_reply.html";
    }
    @PostMapping("/myreply")
    public void popular(Long memberNumber, Model model) {
        model.addAttribute("selectMemberReplyAll", replyService.showMemberReplyAll(memberNumber));
    }



    //    마이페이지 내 포인트
    @GetMapping("/mypoints")
    public String mypoints() {
        return "mypage/mypage_points.html";
    }

    //    마이페이지 충전내역 확인
    @GetMapping("/mycash")
    public String mycash() {
        return "mypage/mypage_cash.html";
    }


}