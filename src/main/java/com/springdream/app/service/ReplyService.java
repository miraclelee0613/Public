package com.springdream.app.service;

import com.springdream.app.domain.ReplyDTO;
import com.springdream.app.domain.ReplyVO;
<<<<<<< HEAD
import com.springdream.app.mapper.ReplyMapper;
import com.springdream.app.repository.ReplyDAO;
import lombok.RequiredArgsConstructor;
=======
>>>>>>> c06c7192fc0b3c9013a4d1f14b58f68685d8cad7
import org.springframework.stereotype.Service;

import java.util.List;

@Service
<<<<<<< HEAD
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
=======
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

>>>>>>> c06c7192fc0b3c9013a4d1f14b58f68685d8cad7
