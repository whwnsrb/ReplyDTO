package kr.co.replydto.replydto.replyDTO;

import lombok.Data;

import java.util.Date;

@Data
public class ReplyDTO {
    private Long replyId;
    private Long boardId;
    private String membernickname;
    private String replycontent;
    private Date regdate;
    private Date updatedate;
    private String memberId;
    private String secretreply;

}
