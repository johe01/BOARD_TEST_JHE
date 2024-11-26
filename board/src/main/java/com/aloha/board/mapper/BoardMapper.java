package com.aloha.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.aloha.board.domain.Board;
import com.aloha.board.domain.Page;

@Mapper
public interface BoardMapper {

    public List<Board> list(@Param("page") Page page) throws Exception;

    public List<Board> listByPage(@Param("page") Page page) throws Exception;

    public Board select(int no) throws Exception;

    public int insert(Board board) throws Exception;

    public int update(Board board) throws Exception;

    public int delete(int no) throws Exception;
    
    public int count() throws Exception;

}
