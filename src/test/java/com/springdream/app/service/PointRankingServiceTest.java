package com.springdream.app.service;

import com.springdream.app.domain.Criteria;
import com.springdream.app.domain.PointVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class PointRankingServiceTest {

    @Autowired
    private PointRankingService pointRankingService;

    @Test
    public void list() {
        pointRankingService.list(new Criteria().create(1,5)).stream().map(PointVO::getTotalPoint).forEach(a -> log.info(a.toString()));
    }
}