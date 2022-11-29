package com.springdream.app.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class BoardVO {
    private Long boardNumber;
    private String boardRegisterDate;
    private String boardUpdateDate;
    private String boardTitle;
    private String boardContent;
    private int boardReward;
    private int boardCategory;
    private int boardAdopt;
    private int boardReport;
    private long memberNumber;

    public void create(String boardRegisterDate, String boardUpdateDate, String boardTitle, String boardContent, int boardReward, int boardCategory, int boardAdopt, int boardReport, long memberNumber) {
        this.boardRegisterDate = boardRegisterDate;
        this.boardUpdateDate = boardUpdateDate;
        this.boardTitle = boardTitle;
        this.boardContent = boardContent;
        this.boardReward = boardReward;
        this.boardCategory = boardCategory;
        this.boardAdopt = boardAdopt;
        this.boardReport = boardReport;
        this.memberNumber = memberNumber;
    }
}
