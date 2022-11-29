package com.springdream.app.domain;

import lombok.Data;
<<<<<<< HEAD
=======
import lombok.NoArgsConstructor;
>>>>>>> 96b6b6afb51683d395c065a2d524b8e3d8cb1165
import org.springframework.stereotype.Component;

@Component
@Data
<<<<<<< HEAD
=======
@NoArgsConstructor
>>>>>>> 96b6b6afb51683d395c065a2d524b8e3d8cb1165
public class BoardDTO {
    private Long boardNumber;
    private String boardTitle;
    private String boardContent;
    private String boardDate;
    private String boardUpdateDate;
    private int boardReward;
    private int boardCategory;
    private Long memberNumber;
    private String memberNickname;
    private String memberRank;
    private String fileName;
    private String fileUploadPath;
    private String fileUUID;

//    public void create(String boardTitle, String boardContent, int boardReward, String memberNickname, String memberRank) {
//        this.boardTitle = boardTitle;
//        this.boardContent = boardContent;
//        this.boardReward = boardReward;
//        this.memberNickname = memberNickname;
//        this.memberRank = memberRank;
//    }
}
