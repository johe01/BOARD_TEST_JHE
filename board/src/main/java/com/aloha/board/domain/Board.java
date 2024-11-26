package com.aloha.board.domain;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Board {
    private int no;
    private String title;
    private String writer;
    private String content;
    private Date createdAt;
    private Date updatedAt;

}
