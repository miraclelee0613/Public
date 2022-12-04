package com.springdream.app.service;

import com.springdream.app.domain.ReplyDTO;
import com.springdream.app.domain.ReplyVO;
import com.springdream.app.mapper.ReplyMapper;
import com.springdream.app.repository.ReplyDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReplyService {
    private final ReplyDAO replyDAO;

    //    답글 추가
    public void register(ReplyVO replyVO){
        replyDAO.save(replyVO);
    }

    //    답글 조회
    public List<ReplyDTO> showAll(Long boardNumber){
        return replyDAO.findAll(boardNumber);
    }

    //    답글 수정
    public void modify(ReplyDTO replyDTO){
        replyDAO.setReplyDTO(replyDTO);
    }

    //    답글 삭제
    public void remove(Long replyNumber){
        replyDAO.remove(replyNumber);
    }

    public ReplyDTO show(Long replyNumber){
        return replyDAO.findById(replyNumber);
    }

}
