package com.springdream.app.mapper;

import com.springdream.app.domain.BoardVO;
import com.springdream.app.domain.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    // 회원 가입
    public void insert(MemberVO memberVO);

    // 회원 업데이트
    public void update(MemberVO memberVO);

    // 회원 삭제
    public void delete(Long memberNumber);

    // 회원 비활성화
    public void quit(Long memberNumber);

    // 회원 조회
    public MemberVO select(Long memberNumber);

    // 회원 전체조회
    public List<MemberVO> selectAll();

    // 중복체크
    public int checkId(String memberId);

    // 로그인
    public int login(MemberVO memberVO);

}
