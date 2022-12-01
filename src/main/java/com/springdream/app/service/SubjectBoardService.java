package com.springdream.app.service;

import com.springdream.app.domain.BoardDTO;
import com.springdream.app.domain.BoardVO;
import com.springdream.app.repository.BoardDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor @Qualifier("subject") @Primary
public class SubjectBoardService implements BoardService{

    private final BoardDAO boardDAO;

    @Override
    public void register(BoardVO boardVO) {
        boardDAO.save(boardVO);
    }

    @Override
    public void modify(BoardDTO boardDTO) {
        boardDAO.setBoardDTO(boardDTO);
    }

    @Override
    public void remove(Long boardNumber) {

    }

    @Override
    public BoardDTO show(Long boardNumber) {
        return boardDAO.findByBoard(boardNumber);
    }

    @Override
    public List<BoardDTO> showAll() {
        return boardDAO.findUnreportAll();
    }
}
