package com.springdream.app.repository;


import com.springdream.app.domain.Criteria;
import com.springdream.app.domain.PointVO;
import com.springdream.app.mapper.PointMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PointDAO {
<<<<<<< HEAD
=======
    private final PointMapper pointMapper;
>>>>>>> 96b6b6afb51683d395c065a2d524b8e3d8cb1165

    //    포인트 조회
    public PointVO findById(Long memberNumber){
        return pointMapper.select(memberNumber);
    }

    public List<PointVO> findAll(Criteria criteria){
        return pointMapper.rankList(criteria);
    }

    //    누적 포인트
    public PointVO totalPointById(Long memberNumber){
        return pointMapper.totalPoint(memberNumber);
    }

    //    채택 포인트 전송 (1 to 2)
    public PointVO sendPoint(Long memberNumber1, Long memberNumber2){
        
    }


//    private final BoardMapper boardMapper;
//    //    추가
//    public void save(BoardDTO boardDTO){
//        boardMapper.insert(boardDTO);
//    }
//    //    수정
//    public void setBoardVO(BoardDTO boardDTO){
//        boardMapper.update(boardDTO);
//    }
//    //    삭제
//    public void remove(Long boardNumber){
//        boardMapper.delete(boardNumber);
//    }
//    //    조회
//    public BoardVO findById(Long boardNumber){
//        return boardMapper.select(boardNumber);
//    }
//    //    전체 조회
//    public List<BoardVO> findAll(Criteria criteria){
//        return boardMapper.selectAll(criteria);
//    }
//    //    전체 개수
//    public int findCountAll(){
//        return boardMapper.getTotal();
//    }
}
