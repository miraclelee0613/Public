package com.springdream.app.mapper;


import com.springdream.app.domain.BoardDTO;
import com.springdream.app.domain.BoardVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class BoardMapperTest {
    @Autowired
    private BoardMapper boardMapper;


    //    게시글 작성 테스트
    @Test
    public void insertTest(){
        BoardVO boardVO = new BoardVO();
        boardVO.create("새로 쓴 글2", "새로 쓴 내용", 500, "국어", 1L);
        boardMapper.insert(boardVO);
    }

    //    게시글 수정 테스트
    @Test
    public void updateTest(){
        BoardDTO boardDTO = boardMapper.select(1L);
        boardDTO.setBoardTitle("수정된 게시글 제목");
        boardMapper.update(boardDTO);
    }

    //    게시글 조회 테스트
    @Test
    public void selectTest(){
        log.info("board : " + boardMapper.select(1L));
    }

    //    게시글 목록 전체 조회
    @Test
    public void selectAllTest(){
        boardMapper.selectAll().stream().map(BoardDTO::getBoardTitle).forEach(log::info);
    }

    //    신고 안된사람 조회
    @Test
    public void selectUnreportAllTest(){
        boardMapper.selectUnreportAll().stream().map(BoardDTO::getBoardTitle).forEach(log::info);
    }

    //    인기글 조회
    @Test
    public void popularBoard(){
        boardMapper.popularBoard().stream().map(BoardDTO::getBoardTitle).forEach(log::info);
    }

    //    최신글 조회
    @Test
    public void recentBoard(){
        boardMapper.recentBoard().stream().map(BoardDTO::getBoardTitle).forEach(log::info);
    };

    //    카테고리별 조회
    @Test
    public void categoryBoard(){
        boardMapper.categoryBoard("국어").stream().map(BoardDTO::getBoardTitle).forEach(log::info);
    };
}

