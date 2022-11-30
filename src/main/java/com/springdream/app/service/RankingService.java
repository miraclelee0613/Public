package com.springdream.app.service;

import com.springdream.app.domain.Criteria;
import com.springdream.app.domain.PointVO;
import com.springdream.app.repository.PointDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RankingService {
    //    랭킹 목록
    public List<PointVO> showAll(Criteria criteria);

}

