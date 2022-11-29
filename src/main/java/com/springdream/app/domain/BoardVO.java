package com.springdream.app.domain;

<<<<<<< HEAD
=======

>>>>>>> 96b6b6afb51683d395c065a2d524b8e3d8cb1165
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class BoardVO {
    private Long boardNumber;
<<<<<<< HEAD
    private String boardRegisterDate;
    private String boardUpdateDate;
=======
>>>>>>> 96b6b6afb51683d395c065a2d524b8e3d8cb1165
    private String boardTitle;
    private String boardContent;
    private int boardReward;
    private int boardCategory;
    private int boardAdopt;
    private int boardReport;
<<<<<<< HEAD
    private long memberNumber;

    public void create(String boardRegisterDate, String boardUpdateDate, String boardTitle, String boardContent, int boardReward, int boardCategory, int boardAdopt, int boardReport, long memberNumber) {
        this.boardRegisterDate = boardRegisterDate;
        this.boardUpdateDate = boardUpdateDate;
=======
    private Long memberNumber;

    public void create(String boardTitle, String boardContent, int boardReward, int boardCategory) {
>>>>>>> 96b6b6afb51683d395c065a2d524b8e3d8cb1165
        this.boardTitle = boardTitle;
        this.boardContent = boardContent;
        this.boardReward = boardReward;
        this.boardCategory = boardCategory;
<<<<<<< HEAD
        this.boardAdopt = boardAdopt;
        this.boardReport = boardReport;
        this.memberNumber = memberNumber;
=======
>>>>>>> 96b6b6afb51683d395c065a2d524b8e3d8cb1165
    }
}
