package com.springdream.app.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class NoticeDTO {
    private Long noticeNumber;
    private String noticeDate;
    private String noticeTitle;
    private String noticeContent;

    //  TBL_MEMBER
    private Long memberNumber;
    private String memberId;
    private String memberName;

    //
}
