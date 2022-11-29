package com.springdream.app.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class PointVO {

    private long pointIndex;
    private long currentPoint;
    private long totalPoint;
    private long memberNumber;

//    CREATE TABLE TBL_POINT(
//            POINT_INDEX NUMBER CONSTRAINT PK_POINT PRIMARY KEY,
//            CURRENT_POINT NUMBER DEFAULT 0,
//            TOTAL_POINT NUMBER DEFAULT 0,
//            MEMBER_NUMBER NUMBER,
//            CONSTRAINT FK_MEMBER_NUMBER3 FOREIGN KEY(MEMBER_NUMBER) REFERENCES TBL_MEMBER(MEMBER_NUMBER) ON DELETE CASCADE
//);
}
