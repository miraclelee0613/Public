package com.springdream.app.service;

import com.springdream.app.domain.BoardDTO;
import com.springdream.app.domain.BoardVO;
import com.springdream.app.domain.Criteria;
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
    public List<BoardDTO> showMemberBoardAll(Long memberNumber) {
        return boardDAO.findMemberBoardAll(memberNumber);
    }

    @Override
    public BoardDTO show(Long boardNumber) {
        return boardDAO.findByBoard(boardNumber);
    }

    @Override
    public List<BoardDTO> showAll(Criteria criteria) {
        return boardDAO.findUnreportAll(criteria);
    }

    @Override
    public List<BoardDTO> popularPost(Criteria criteria) {
        return boardDAO.popularPost(criteria);
    }

    @Override
    public List<BoardDTO> recentPost(Criteria criteria) {
        return boardDAO.recentPost(criteria);
    }

    @Override
    public List<BoardDTO> categoryPost(String category) {
        return boardDAO.categoryPost(category);
    }

    @Override
    public List<BoardDTO> koreanPost(Criteria criteria) {
        return boardDAO.koreanPost(criteria);
    }
    @Override
    public List<BoardDTO> mathPost(Criteria criteria) {
        return boardDAO.mathPost(criteria);
    }
    @Override
    public List<BoardDTO> englishPost(Criteria criteria) {
        return boardDAO.englishPost(criteria);
    }
    @Override
    public List<BoardDTO> societyPost(Criteria criteria) {
        return boardDAO.societyPost(criteria);
    }
    @Override
    public List<BoardDTO> sciencePost(Criteria criteria) {
        return boardDAO.sciencePost(criteria);
    }
    @Override
    public List<BoardDTO> historyPost(Criteria criteria) {
        return boardDAO.historyPost(criteria);
    }
    @Override
    public List<BoardDTO> foreignPost(Criteria criteria) {
        return boardDAO.foreignPost(criteria);
    }

//    페이징 처리
    @Override
    public int getTotal() {
        return boardDAO.findCountAll();
    }

}
