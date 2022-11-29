package com.springdream.app.mapper;

import com.springdream.app.domain.BoardDTO;
import com.springdream.app.domain.BoardVO;
import com.springdream.app.repository.BoardDAO;
import com.springdream.app.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor @Qualifier("Subject") @Primary
public class SubjectBoardService implements BoardService {
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
        boardDAO.remove(boardNumber);
    }

    @Override
    public BoardDTO show(Long boardNumber) {
        return boardDAO.findByBoard(boardNumber);
    }

    @Override
    public List<BoardDTO> showAll() {
        return boardDAO.findAll();
    }
}
