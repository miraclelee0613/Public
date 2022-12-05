package com.springdream.app.controller;

import com.springdream.app.domain.BoardDTO;
import com.springdream.app.domain.BoardVO;
import com.springdream.app.domain.Criteria;
import com.springdream.app.domain.PageDTO;
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
  public void main(Criteria criteria, Model model) {

    model.addAttribute("boardCount", boardService.recentPost(criteria).size());
    model.addAttribute("boards", boardService.recentPost(criteria));
  }

  //    게시글 등록
  @GetMapping("/writePage")
  public void write(Model model) {
    model.addAttribute("board", new BoardVO());
  }

  @PostMapping("/writePage")
  public RedirectView write(BoardVO boardVO, RedirectAttributes redirectAttributes) {
    boardVO.setMemberNumber(23L);
    boardService.register(boardVO);
    redirectAttributes.addFlashAttribute("boardNumber", boardVO.getBoardNumber());
    return new RedirectView("/board/boardMain");
  }

  //    게시글 상세보기
  @GetMapping("/page")
  public String read(Long boardNumber, Model model) {
    String category = boardService.show(boardNumber).getBoardCategory();
//       model.addAttribute("replylist", replyService.showList());
    model.addAttribute("boardlist", boardService.categoryPost(category));
    model.addAttribute("board", boardService.show(boardNumber));
    return "/board/page";
  }

  //    게시글 수정
  @PostMapping("/update")
  public RedirectView update(BoardDTO boardDTO, RedirectAttributes redirectAttributes) {
    boardService.modify(boardDTO);
    redirectAttributes.addFlashAttribute("boardNumber", boardDTO.getBoardNumber());
    return new RedirectView("/board/read");
  }

  //    게시글 삭제
  @GetMapping("/delete")
  public RedirectView delete(Long boardNumber) {
    boardService.remove(boardNumber);
    return new RedirectView("/board/boardMain");
  }

  //    인기글
  @GetMapping("/popular")
  public void popular(Criteria criteria, Model model) {
    model.addAttribute("popular", boardService.popularPost(criteria));
    model.addAttribute("paging", new PageDTO().createPageDTO(criteria, boardService.getTotal()));
  }

  //    최신글
  @GetMapping("/recent")
  public void recent(Criteria criteria, Model model) {
    model.addAttribute("recent", boardService.recentPost(criteria));
  }

  //    국어
  @GetMapping("/korean")
  public void korean(Criteria criteria, Model model) {
    model.addAttribute("korean", boardService.koreanPost(criteria));
  }

  //    수학
  @GetMapping("/math")
  public void math(Criteria criteria, Model model) {
    model.addAttribute("math", boardService.mathPost(criteria));
  }

  //    영어
  @GetMapping("/english")
  public void english(Criteria criteria, Model model) {
    model.addAttribute("english", boardService.englishPost(criteria));
  }

  //    사탐
  @GetMapping("/society")
  public void society(Criteria criteria, Model model) {
    model.addAttribute("society", boardService.societyPost(criteria));
  }

  //    과탐
  @GetMapping("/science")
  public void science(Criteria criteria, Model model) {
    model.addAttribute("science", boardService.sciencePost(criteria));
  }

  //    한국사
  @GetMapping("/history")
  public void history(Criteria criteria, Model model) {
    model.addAttribute("history", boardService.historyPost(criteria));
  }

  //    제2외국어
  @GetMapping("/foreign")
  public void foreign(Criteria criteria, Model model) {
    model.addAttribute("foreign", boardService.foreignPost(criteria));
  }
}