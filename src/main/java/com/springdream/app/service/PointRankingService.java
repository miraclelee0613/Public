package com.springdream.app.service;

import com.springdream.app.domain.Criteria;
import com.springdream.app.domain.PointVO;
import com.springdream.app.repository.PointDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor @Qualifier("ranking") @Primary
public class PointRankingService implements PointService {
    private final PointDAO pointDAO;

//    포인트 보유 리스트
    @Override
    public List<PointVO> list(Criteria criteria) {
        return pointDAO.findAll(criteria);
    }
}






















