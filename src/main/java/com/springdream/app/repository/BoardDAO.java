package com.springdream.app.repository;

import com.springdream.app.domain.BoardDTO;
import com.springdream.app.domain.BoardVO;
import com.springdream.app.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardDAO {
    private final BoardMapper boardMapper;
<<<<<<< HEAD

=======
>>>>>>> 96b6b6afb51683d395c065a2d524b8e3d8cb1165
    //    추가
    public void save(BoardVO boardVO){
        boardMapper.insert(boardVO);
    }
    //    수정
<<<<<<< HEAD
    public void setBoardVO(BoardVO boardVO){
        boardMapper.update(boardVO);
=======
    public void setBoardDTO(BoardDTO boardDTO){
        boardMapper.update(boardDTO);
>>>>>>> 96b6b6afb51683d395c065a2d524b8e3d8cb1165
    }
    //    삭제
    public void remove(Long boardNumber){
        boardMapper.delete(boardNumber);
    }
    //    조회
<<<<<<< HEAD
    public BoardVO findById(Long boardNumber){
        return boardMapper.select(boardNumber);
    }
    //    전체 조회
    public List<BoardVO> findAll(){
        return boardMapper.selectAll();
    }
    //    전체 개수
    public int findCountAll(){
        return boardMapper.getTotal();
    }
=======
    public BoardDTO findByBoard(Long boardNumber){
        return boardMapper.select(boardNumber);
    }
    //    전체 조회
    public List<BoardDTO> findAll(){
        return boardMapper.selectAll();
    }

//    //    전체 개수
//    public int findCountAll(){
//        return boardMapper.getTotal();
//    }
>>>>>>> 96b6b6afb51683d395c065a2d524b8e3d8cb1165
}
