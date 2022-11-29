package com.springdream.app.service;

import com.springdream.app.domain.BoardDTO;
import com.springdream.app.domain.BoardVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {
    //    추가
    public void register(BoardVO boardVO);
    //    수정
    public void modify(BoardDTO boardVO);
    //    삭제
    public void remove(Long boardNumber);
    //    조회
    public BoardDTO show(Long boardNumber);
    //    전체 조회
    public List<BoardDTO> showAll();
}
