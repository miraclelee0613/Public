package com.springdream.app.service;

import com.springdream.app.domain.BoardDTO;
import com.springdream.app.domain.BoardVO;
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
    public List<BoardDTO> showAll() {
        return null;
    }

    @Override
    public List<BoardDTO> popularPost() {
        return null;
    }

    @Override
    public List<BoardDTO> recentPost() {
        return null;
    }

    @Override
    public List<BoardDTO> categoryPost(String category) {
        return null;
    }

    @Override
    public List<BoardDTO> koreanPost() {
        return null;
    }

    @Override
    public List<BoardDTO> mathPost() {
        return null;
    }

    @Override
    public List<BoardDTO> englishPost() {
        return null;
    }

    @Override
    public List<BoardDTO> societyPost() {
        return null;
    }

    @Override
    public List<BoardDTO> sciencePost() {
        return null;
    }

    @Override
    public List<BoardDTO> historyPost() {
        return null;
    }

    @Override
    public List<BoardDTO> foreignPost() {
        return null;
    }
}
