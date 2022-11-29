package com.springdream.app.service;

import com.springdream.app.domain.PointVO;
import com.springdream.app.repository.PointDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RankingService {
    private final PointDAO pointDAO;

    //    랭킹 목록
//    public void list(PointVO pointVO) {
//        pointDAO.
//
//    }

}

