package com.springdream.app.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class MemberDAOTest {

    @Autowired
    private MemberDAO memberDAO;

    @Test
    public void getBoardNumTest() { log.info("boardNum : " + memberDAO.getBoardNum(1L)); }

    @Test
    public void selectRecentTest() { log.info("select recent : " + memberDAO.selectRecent(20)); }

}