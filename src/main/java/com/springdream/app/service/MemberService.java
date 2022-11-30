package com.springdream.app.service;

import com.springdream.app.domain.MemberVO;
import com.springdream.app.repository.MemberDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor @Qualifier("member") @Primary
public class MemberService {

    private final MemberDAO memberDAO;

    //  회원가입
    public void register(MemberVO memberVO){
        memberDAO.join(memberVO);
    }
    //  정보 수정
    public void modify(MemberVO memberVO){
        memberDAO.update(memberVO);
    }

    //  회원탈퇴
    public void quit(Long memberNumber){
        memberDAO.quit(memberNumber);
    }

    //  회원조회
    public MemberVO select(Long memberNumber){
        return memberDAO.select(memberNumber);
    }

    //  전체 회원조회
    public List<MemberVO> selectAll(){
        return memberDAO.selectAll();
    }

    //  아이디 중복확인  public int checkId(String memberId);
    public int checkId(String memberId) {return memberDAO.checkId(memberId); }

    //  로그인
    public int login(MemberVO memberVO) { return memberDAO.login(memberVO); }
}
