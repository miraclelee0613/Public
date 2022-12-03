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
//    조회
    public ReplyDTO select(Long replyNumber);
}
