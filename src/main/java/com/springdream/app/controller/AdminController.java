package com.springdream.app.controller;

import com.springdream.app.domain.MemberDTO;
import com.springdream.app.service.BoardService;
import com.springdream.app.service.AdminMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/*")
public class AdminController {

    private final BoardService boardService;
    private final AdminMemberService adminMemberService;

    @GetMapping("main")
    public String main(Model model){
        // 관리자 계정인지 검사 필요
        model.addAttribute("newMembers", adminMemberService.newMembers(10));
        return "admin/adminPage-main";
    }

    // 유저 리스트
    @GetMapping("userlist")
    public String userList(Model model){
        int totalMemberCount = adminMemberService.selectAll().size();

//        List<Integer> boardCount = new ArrayList<>();
//        memberService.selectAll().forEach(memberVO -> {
//            boardCount.add(memberService.boardCount(memberVO.getMemberNumber()));
//        });

        List<MemberDTO> members = new ArrayList<>();
               adminMemberService.selectAll().forEach(memberVO -> {
               MemberDTO memberDTO = new MemberDTO();
               memberDTO.setMemberNumber(memberVO.getMemberNumber());
               memberDTO.setMemberId(memberVO.getMemberId());
               memberDTO.setMemberName(memberVO.getMemberName());
               memberDTO.setMemberMobile(memberVO.getMemberMobile());
               memberDTO.setMemberEmail(memberVO.getMemberEmail());
               memberDTO.setMemberBoardCount(adminMemberService.boardCount(memberVO.getMemberNumber()));
    //           memberDTO.setMemberReplyCount(memberService.replyCount(memberVO.getMemberNumber()));
               members.add(memberDTO);
           });

        model.addAttribute("members", members);
        model.addAttribute("memberTotal", totalMemberCount);
        return "admin/adminPage-userlist";
    }

    @GetMapping("support")
    public String support(){
        return "admin/adminPage-support";
    }

    // 게시글 목록
    @GetMapping("boards")
    public String boards(Model model){
        int totalBoardCount = boardService.showAll().size();
        model.addAttribute("boards", boardService.showAll());
        model.addAttribute("totalBoardCount", totalBoardCount);
        return "admin/adminPage-post";
    }

    @GetMapping("report")
    public String report(){
        return "admin/adminPage-report";
    }
}
