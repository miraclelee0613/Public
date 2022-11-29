package com.springdream.app.mapper;

import com.springdream.app.domain.Criteria;
import com.springdream.app.domain.PointVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PointMapper {
    public PointVO select(Long memberNumber);
    public PointVO totalPoint(Long memberNumber);
    public List<PointVO> rankList(Criteria criteria);

}
