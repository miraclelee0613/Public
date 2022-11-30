package com.springdream.app.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class SupportVO {

    private Long supportNumber;
    private String supportDate;
    private String supportTitle;
    private String supportContent;
    private Long memberNumber;

    public void create(String supportTitle, String supportContent, Long memberNumber) {
        this.supportTitle = supportTitle;
        this.supportContent = supportContent;
        this.memberNumber = memberNumber;
    }
}
