package com.aloha.board.service;

import java.util.List;

import org.springframework.ui.Model;

import com.aloha.board.domain.Board;
import com.aloha.board.domain.Page;

public interface BoardService {
    public List<Board> list() throws Exception;

    public List<Board> list(Page page) throws Exception;

    public Board select(int no) throws Exception;

    public int insert(Board board) throws Exception;

    public int update(Board board) throws Exception;

    public int delete(int no) throws Exception;

    public int count() throws Exception;
}
