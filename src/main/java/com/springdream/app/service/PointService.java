package com.springdream.app.service;

import com.springdream.app.domain.Criteria;
import com.springdream.app.domain.PointVO;
import com.springdream.app.repository.PointDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

// worker: LeeJunSang
// lastUpdate :
@Service
public interface PointService {
//    private final PointDAO pointDAO;

    //  랭킹 목록
    public List<PointVO> list();

}

