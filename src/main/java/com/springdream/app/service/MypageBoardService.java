package com.springdream.app.service;

import com.springdream.app.domain.BoardDTO;
import com.springdream.app.domain.BoardVO;
import com.springdream.app.domain.Criteria;
import com.springdream.app.repository.BoardDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MypageBoardService implements BoardService{

    private final BoardDAO boardDAO;

    @Override
    public void register(BoardVO boardVO) {

    }

    @Override
    public void modify(BoardDTO boardDTO) {

    }

    @Override
    public void remove(Long boardNumber) {

    }

    @Override
    public BoardDTO show(Long boardNumber) {
        return null;
    }

    @Override
    public List<BoardDTO> showMemberBoardAll(Long memberNumber) {
        return boardDAO.findMemberBoardAll(memberNumber);
    }

    @Override
    public List<BoardDTO> showAll(Criteria criteria) {
        return null;
    }

    @Override
    public List<BoardDTO> popularPost(Criteria criteria) {
        return null;
    }

    @Override
    public List<BoardDTO> recentPost(Criteria criteria) {
        return null;
    }

    @Override
    public List<BoardDTO> categoryPost(String category) {
        return null;
    }

    @Override
    public List<BoardDTO> koreanPost(Criteria criteria) {
        return null;
    }

    @Override
    public List<BoardDTO> mathPost(Criteria criteria) {
        return null;
    }

    @Override
    public List<BoardDTO> englishPost(Criteria criteria) {
        return null;
    }

    @Override
    public List<BoardDTO> societyPost(Criteria criteria) {
        return null;
    }

    @Override
    public List<BoardDTO> sciencePost(Criteria criteria) {
        return null;
    }

    @Override
    public List<BoardDTO> historyPost(Criteria criteria) {
        return null;
    }

    @Override
    public List<BoardDTO> foreignPost(Criteria criteria) {
        return null;
    }

    @Override
    public int getTotal() {
        return 0;
    }


}
