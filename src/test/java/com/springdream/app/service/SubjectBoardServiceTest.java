package com.springdream.app.service;

import com.springdream.app.domain.BoardDTO;
import com.springdream.app.domain.BoardVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
public class SubjectBoardServiceTest {
    @Autowired
    private BoardService boardService;

    //    게시글 작성 테스트
    @Test
    public void registerTest(){
        BoardVO boardVO = new BoardVO();
        boardVO.create("새로 쓴 글2", "새로 쓴 내용", 500, 1, 1L);
        boardService.register(boardVO);
    }

    //    게시글 수정 테스트
    @Test
    public void modifyTest(){
        BoardDTO boardDTO = boardService.show(1L);
        boardDTO.setBoardTitle("수정된 게시글 제목");
        boardService.modify(boardDTO);
    }

    //    게시글 조회 테스트
    @Test
    public void showTest(){
        log.info("board : " + boardService.show(1L));
    }

    //    게시글 목록 전체 조회
    @Test
    public void showAllTest(){
        boardService.showAll().stream().map(BoardDTO::getBoardTitle).forEach(log::info);
    }

}