package com.springdream.app.mapper;

<<<<<<< HEAD
import com.springdream.app.domain.BoardVO;
import com.springdream.app.domain.MemberVO;
=======
import com.springdream.app.domain.BoardDTO;
import com.springdream.app.domain.BoardVO;
>>>>>>> 96b6b6afb51683d395c065a2d524b8e3d8cb1165
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Member;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
<<<<<<< HEAD
class BoardMapperTest {

    @Autowired
    private BoardMapper boardMapper;

    @Test
    public void insertTest(){
        BoardVO boardVO = new BoardVO();
        MemberVO memberVO = new MemberVO();
        memberVO.setMemberNumber(1);
        boardVO.create(null, null, "테스트용 제목2", "테스트용 내용2",
                200, 1, 0, 0, memberVO.getMemberNumber());
        boardMapper.insert(boardVO);
    }

    @Test
    public void updateTest(){
        BoardVO boardVO = new BoardVO();
        MemberVO memberVO = new MemberVO();
        memberVO.setMemberNumber(1);
        boardVO.create(null, null, "수정된 테스트용 제목", "수정된 테스트용 내용",
                200, 1, 0, 0, memberVO.getMemberNumber());
        boardVO.setBoardNumber((long)1);
        boardMapper.update(boardVO);
    }

    @Test
    public void selectAllTest(){
        List<BoardVO> list = boardMapper.selectAll();
        log.info("board list : " + list);
    }

    @Test
    public void selectTest(){
        BoardVO boardVO = boardMapper.select((long)1);
        log.info("board : " + boardVO);
    }

    @Test
    public void deleteTest(){
        boardMapper.delete((long)3);
    }

    @Test
    public void getTotal(){
        log.info("total board : " + boardMapper.getTotal());
    }
}
=======
public class BoardMapperTest {
    @Autowired
    private BoardMapper boardMapper;


//    게시글 작성 테스트
    @Test
    public void insertTest(){
        BoardVO boardVO = new BoardVO();
        boardVO.create("새로 쓴 글2", "새로 쓴 내용", 500, 1);
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
}
>>>>>>> 96b6b6afb51683d395c065a2d524b8e3d8cb1165
