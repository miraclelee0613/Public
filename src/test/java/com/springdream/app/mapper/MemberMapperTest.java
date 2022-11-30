package com.springdream.app.mapper;

import com.springdream.app.domain.BoardVO;
import com.springdream.app.domain.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MemberMapperTest {

    @Autowired
    private MemberMapper memberMapper;

    @Test
    public void insertTest(){
        MemberVO memberVO = new MemberVO();
        memberVO.create("msj2331", "1234", "kmg2331@gmail.com",
                "문성준", "테스트닉123", "01034442331",
                "1", 1);
        memberMapper.insert(memberVO);
    }

    @Test
    public void updateTest(){
        MemberVO memberVO = new MemberVO();
        memberVO.create("msj2331", "1234", "msh1234@gmail.com",
                "문승현", "테스트닉321", "01034442331",
                "2", 1);
        memberVO.setMemberNumber((long)5);
        memberMapper.update(memberVO);
    }

    @Test
    public void deleteTest(){
        memberMapper.delete((long)3);
    }

    @Test
    public void quitTest(){
        MemberVO memberVO = new MemberVO();
        memberVO.setMemberNumber(6);
        memberMapper.quit(memberVO.getMemberNumber());
    }

    @Test
    public void selectTest(){
        MemberVO memberVO = new MemberVO();
        memberVO.setMemberNumber(1);
        log.info("select : " +  memberMapper.select(memberVO.getMemberNumber()));
    }

    @Test
    public void selectAllTest(){
        log.info("selectAll : " + memberMapper.selectAll());
    }
}
