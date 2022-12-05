package com.springdream.app.repository;

import com.springdream.app.domain.ReplyDTO;
import com.springdream.app.domain.ReplyVO;
import com.springdream.app.mapper.ReplyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ReplyDAO {
<<<<<<< HEAD
    private final ReplyMapper replyMapper;

    //    답글 추가
    public void save(ReplyVO replyVO){
        replyMapper.insert(replyVO);
    }

    //    답글 조회
    public List<ReplyDTO> findAll(Long boardNumber){
        return replyMapper.selectAll(boardNumber);
    }

    //    답글 수정
    public void setReplyDTO(ReplyDTO replyDTO){
        replyMapper.update(replyDTO);
    }

    //    답글 삭제
    public void remove(Long replyNumber){
        replyMapper.delete(replyNumber);
    }

    //    답글 채택
    public ReplyDTO findById(Long replyNumber){
        return replyMapper.select(replyNumber);
=======

    private final ReplyMapper replyMapper;

    //    답글 추가
    public void insert(ReplyVO replyVO) { replyMapper.insert(replyVO); }
    //    답글 수정
    public void update(ReplyDTO replyDTO) { replyMapper.update(replyDTO); }
    //    답글 삭제
    public void delete(Long replyNumber) { replyMapper.delete(replyNumber); }
    //    답글 조회
    public ReplyDTO select(Long replyNumber) { return replyMapper.select(replyNumber); }

    // 회원 댓글 전체 조회
    public List<ReplyDTO> findMemberReplyAll(Long memberNumber) {
        return replyMapper.selectMemberReplyAll(memberNumber);
>>>>>>> c06c7192fc0b3c9013a4d1f14b58f68685d8cad7
    }

}
