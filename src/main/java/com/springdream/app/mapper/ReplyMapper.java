package com.springdream.app.mapper;

import com.springdream.app.domain.BoardDTO;
import com.springdream.app.domain.BoardVO;
import com.springdream.app.domain.ReplyDTO;
import com.springdream.app.domain.ReplyVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReplyMapper {

    //    추가
    public void insert(ReplyVO replyVO);
    //    수정
    public void update(ReplyDTO replyDTO);
    //    삭제
    public void delete(Long replyNumber);
<<<<<<< HEAD
//    조회
    public List<ReplyDTO> selectAll(Long replyNumber);
=======
    //    조회
>>>>>>> c06c7192fc0b3c9013a4d1f14b58f68685d8cad7
    public ReplyDTO select(Long replyNumber);

    // 마이페이지 회원 댓글 전체 조회
    public List<ReplyDTO> selectMemberReplyAll(Long memberNumber);


}
