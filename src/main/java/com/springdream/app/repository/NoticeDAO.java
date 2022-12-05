package com.springdream.app.repository;

import com.springdream.app.domain.BoardDTO;
import com.springdream.app.domain.NoticeDTO;
import com.springdream.app.mapper.NoticeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class NoticeDAO {
    private final NoticeMapper noticeMapper;

    public List<NoticeDTO> findAllOderByDate(){ return noticeMapper.selectAllOderByDate();}

    public NoticeDTO findByNoticeNumber(Long noticeNumber) { return noticeMapper.select(noticeNumber);}
}
