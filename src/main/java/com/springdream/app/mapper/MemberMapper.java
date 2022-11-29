package com.springdream.app.mapper;

import com.springdream.app.domain.BoardVO;
import com.springdream.app.domain.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    public void insert(MemberVO memberVO);

    public void update(MemberVO memberVO);

    public void delete(Long memberNumber);

    public void quit(Long memberNumber);

    public MemberVO select(Long memberNumber);

    public List<MemberVO> selectAll();
}
