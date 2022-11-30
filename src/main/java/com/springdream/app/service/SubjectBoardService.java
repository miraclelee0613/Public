package com.springdream.app.service;

import com.springdream.app.domain.BoardDTO;
import com.springdream.app.domain.BoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor @Qualifier("subject") @Primary
public class SubjectBoardService implements BoardService{

    @Override
    public void register(BoardVO boardVO) {

    }

    @Override
    public void modify(BoardDTO boardVO) {

    }

    @Override
    public void remove(Long boardNumber) {

    }

    @Override
    public BoardDTO show(Long boardNumber) {
        return null;
    }

    @Override
    public List<BoardDTO> showAll() {
        return null;
    }
}
