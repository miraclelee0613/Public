package com.springdream.app.mapper;

import com.springdream.app.domain.BoardDTO;
import com.springdream.app.domain.NoticeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeMapper {
    //  최신순으로 공지사항 글 목록 가져오기
    public List<NoticeDTO> selectAllOderByDate();

    //  공지사항 글 상세보기(boardNumber)
    public NoticeDTO select(Long noticeNumber);
}
