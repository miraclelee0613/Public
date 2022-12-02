package com.springdream.app.controller;

import com.springdream.app.domain.BoardDTO;
import com.springdream.app.domain.BoardVO;
import com.springdream.app.service.BoardService;
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
@RequestMapping("/board/*")
public class BoardController {
    private final BoardService boardService;

//    게시글 목록
    @GetMapping("/boardMain")
    public void main(Model model) {
        model.addAttribute("boards", boardService.showAll());
    }

//    게시글 등록
    @GetMapping("/write")
    public void write(){

    }
    @PostMapping("/write")
    public RedirectView write(BoardVO boardVO, RedirectAttributes redirectAttributes){
        boardService.register(boardVO);
        redirectAttributes.addFlashAttribute("boardNumber", boardVO.getBoardNumber());
        return new RedirectView("/board/boardMain");
    }

//    게시글 상세보기
    @GetMapping("/read")
    public String read(Long boardNumber, Model model){
       model.addAttribute("board", boardService.show(boardNumber));
       return "/board/page";
    }


//    게시글 수정
    @PostMapping("/update")
    public RedirectView update(BoardDTO boardDTO, RedirectAttributes redirectAttributes){
        boardService.modify(boardDTO);
        redirectAttributes.addFlashAttribute("boardNumber", boardDTO.getBoardNumber());
        return new RedirectView("/board/read");
    }

//    게시글 삭제
    @GetMapping("/delete")
    public RedirectView delete(Long boardNumber){
        boardService.remove(boardNumber);
        return new RedirectView("/board/boardMain");
    }

    //    인기글
    @GetMapping("/popular")
    public void popular(Model model) {
        model.addAttribute("popular", boardService.popularPost());
    }
}
