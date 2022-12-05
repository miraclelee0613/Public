package com.springdream.app.controller;

import com.springdream.app.domain.ReplyDTO;
import com.springdream.app.domain.ReplyVO;
import com.springdream.app.service.BoardReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/reply/*")
public class ReplyController {
    private final BoardReplyService replyService;

//    추가
//    @PostMapping(value = "/new", consumes = "application/json", produces = "text/plain; charset=utf-8")
//    public ResponseEntity<String> write(@RequestBody ReplyVO replyVO) throws UnsupportedEncodingException {
//        replyService.register(replyVO);
//        return new ResponseEntity<>(new String("write success".getBytes(), "UTF-8"), HttpStatus.OK);
//    }
//    이 많은 코드를 생략가능
//    @PostMapping("/replyWrite")
//    public String write(@RequestBody ReplyVO replyVO) {
//        replyService.register(replyVO);
//        return "write success";
//    }

    @GetMapping("/replyWrite")
    public void write(Model model){
        model.addAttribute("reply", new ReplyVO());
    }

    @PostMapping("/replyWrite")
    public RedirectView write(ReplyVO replyVO, RedirectAttributes redirectAttributes){
        replyVO.setMemberNumber(61L);
        replyService.register(replyVO);
        redirectAttributes.addFlashAttribute("replyNumber", replyVO.getReplyNumber());
        return new RedirectView("/board/page");
    }

//    조회
    @GetMapping("/{boardNumber}")
    public List<ReplyDTO> list(@PathVariable("boardNumber") Long boardNumber){
        return replyService.showAll(boardNumber);
    }

//    수정
//    @PatchMapping(value = {"/{rno}", "/{rno}/{replyAdopt}"})
//    @PostMapping("/modify")
//    public void modify(@RequestBody ReplyDTO replyDTO){
//        replyDTO.setMemberNumber(Optional.ofNullable(replyDTO.getMemberNumber()).orElse(replyService.show(replyDTO.getMemberNumber()).getMemberNumber()));
//        replyService.modify(replyDTO);
//    }

    @PostMapping("/replyModify")
    public RedirectView modify(ReplyDTO replyDTO, RedirectAttributes redirectAttributes){
        replyService.modify(replyDTO);
        redirectAttributes.addFlashAttribute("replyNumber", replyDTO.getReplyNumber());
        return new RedirectView("/board/page");
    }

//    삭제
//    @DeleteMapping("/{replyNumber}")
//    public void remove(@PathVariable Long replyNumber){
//        replyService.remove(replyNumber);
//    }

    @GetMapping("/delete")
    public RedirectView delete(Long replyNumber){
        replyService.remove(replyNumber);
        return new RedirectView("/board/page");
    }

}

