package com.springdream.app.service;

import com.springdream.app.domain.MemberDTO;
import com.springdream.app.domain.MemberVO;
import com.springdream.app.repository.MemberDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor @Qualifier("member") @Primary
public class AdminMemberService implements MemberService{

    private final MemberDAO memberDAO;

    //  회원가입
    @Override
    public void register(MemberVO memberVO){
        memberDAO.join(memberVO);
    }
    //  정보 수정
    @Override
    public void modify(MemberVO memberVO){
        memberDAO.update(memberVO);
    }

    //  회원탈퇴
    @Override
    public void quit(Long memberNumber){
        memberDAO.quit(memberNumber);
    }

    //  회원조회
    public MemberVO select(Long memberNumber){
        return memberDAO.select(memberNumber);
    }

    //  전체 회원조회
    @Override
    public List<MemberVO> selectAll(){
        return memberDAO.selectAll();
    }

    //  최신 N개 회원조회
    @Override
    public List<MemberVO> newMembers(int criteria){
        return memberDAO.selectRecent(criteria);
    }

    //  회원 게시글 수 조회
    public int boardCount(Long memberNumber){
        return memberDAO.getBoardNum(memberNumber);
    }

    //  아이디 중복확인  public int checkId(String memberId);
    @Override
    public int checkId(String memberId) {return memberDAO.checkId(memberId); }

    //  로그인
    //  로그인 성공 시 memberNumber, 실패 시 0 출력
    @Override
    public int login(MemberVO memberVO) { return memberDAO.login(memberVO); }
}
