package com.springdream.app.mapper;

import com.springdream.app.domain.BoardDTO;
import com.springdream.app.domain.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    //    추가
    public void insert(BoardVO boardVO);
    //    수정
    public void update(BoardDTO boardDTO);
    //    조회수 증가
    public void addViewCount(Long boardNumber);
    //    삭제
    public void delete(Long boardNumber);
    //    조회
    public BoardDTO select(Long boardNumber);

    // 회원 게시글 전체 조회
    public List<BoardDTO> selectMemberAll(Long memberNumber);

    //    신고 제외한 전체 조회
    public List<BoardDTO> selectUnreportAll();

    //    전체 조회
    public List<BoardDTO> selectAll();

    //    인기글 조회
    public List<BoardDTO> popularBoard();

    //    최신글 조회
    public List<BoardDTO> recentBoard();

    //    카테고리별 조회
    public List<BoardDTO> categoryBoard(String category);

    //    국어
    public List<BoardDTO> koreanBoard();
    //    수학
    public List<BoardDTO> mathBoard();
    //    영어
    public List<BoardDTO> englishBoard();
    //    사탐
    public List<BoardDTO> societyBoard();
    //    과탐
    public List<BoardDTO> scienceBoard();
    //    한국사
    public List<BoardDTO> historyBoard();
    //    제2외국어
    public List<BoardDTO> foreignBoard();

    //    검색
    public List<BoardDTO> selectByKeywordAll(String keyword);
}
