package com.springdream.app.mapper;

import com.springdream.app.domain.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    public void insert(BoardVO boardVO);

    public void update(BoardVO boardVO);

    public void delete(long boardNumber);

    public BoardVO select(Long boardNumber);

    public List<BoardVO> selectAll();

    public int getTotal();
}
