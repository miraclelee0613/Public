package com.springdream.app.mapper;

<<<<<<< HEAD
=======
import com.springdream.app.domain.BoardDTO;
>>>>>>> 96b6b6afb51683d395c065a2d524b8e3d8cb1165
import com.springdream.app.domain.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
<<<<<<< HEAD

    public void insert(BoardVO boardVO);

    public void update(BoardVO boardVO);

    public void delete(long boardNumber);

    public BoardVO select(Long boardNumber);

    public List<BoardVO> selectAll();

    public int getTotal();
=======
//    추가
    public void insert(BoardVO boardVO);
//    수정
    public void update(BoardDTO boardDTO);
//    삭제
    public void delete(Long boardNumber);
//    조회
    public BoardDTO select(Long boardNumber);
//    전체 조회
    public List<BoardDTO> selectAll();
>>>>>>> 96b6b6afb51683d395c065a2d524b8e3d8cb1165
}
