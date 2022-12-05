package com.springdream.app.service;

import com.springdream.app.domain.BoardDTO;
import com.springdream.app.domain.BoardVO;
import com.springdream.app.domain.Criteria;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public interface BoardService {
    //    추가
    public void register(BoardVO boardVO);
    //    수정
    public void modify(BoardDTO boardDTO);
    //    삭제
    public void remove(Long boardNumber);
    //    조회
    public BoardDTO show(Long boardNumber);

    // 마이페이지 회원 게시글 전체 조회
    public List<BoardDTO> showMemberBoardAll(Long memberNumber);

    //    전체 조회
    public List<BoardDTO> showAll(Criteria criteria);
    //    인기글 조회
    public List<BoardDTO> popularPost(Criteria criteria);
    //    최신글 조회
    public List<BoardDTO> recentPost(Criteria criteria);
    //    카테고리별 조회
    public List<BoardDTO> categoryPost(String category);

    ////    카테고리별 조회
//    국어
    public List<BoardDTO> koreanPost(Criteria criteria);
    //    수학
    public List<BoardDTO> mathPost(Criteria criteria);
    //    영어
    public List<BoardDTO> englishPost(Criteria criteria);
    //    사탐
    public List<BoardDTO> societyPost(Criteria criteria);
    //    과탐
    public List<BoardDTO> sciencePost(Criteria criteria);
    //    한국사
    public List<BoardDTO> historyPost(Criteria criteria);
    //    제2외국어
    public List<BoardDTO> foreignPost(Criteria criteria);

//    페이징 전체 개수
    public int getTotal();
}
