package com.springdream.app.service;

import com.springdream.app.domain.ReplyDTO;
import com.springdream.app.domain.ReplyVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReplyService {
    //    추가
    public void register(ReplyVO replyVO);
    //    수정
    public void modify(ReplyDTO replyDTO);
    //    삭제
    public void remove(Long replyNumber);
    //    조회
    public ReplyDTO show(Long replyNumber);

    // 마이페이지 회원 게시글 전체 조회
    public List<ReplyDTO> showMemberReplyAll(Long memberNumber);
}

