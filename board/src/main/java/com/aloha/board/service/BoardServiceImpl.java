package com.aloha.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.aloha.board.domain.Board;
import com.aloha.board.domain.Page;
import com.aloha.board.mapper.BoardMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService {
    
    @Autowired BoardMapper boardMapper;
    
    @Override
    public List<Board> list() throws Exception {

        // int total = boardMapper.count();
        // log.info("total : "+total);
        List<Board> boardList = boardMapper.list(new Page());
    
        return boardList;
    }

    @Override
    public List<Board> list(Page page) throws Exception {

        int total = count();
        log.info("total : "+total);
        page.setTotal(total);
        log.info(page.toString());
        log.info("getlast: "+page.getLast());
        log.info("gettotal: "+page.getTotal());
        

        List<Board> boardList = boardMapper.list(page);
    
        return boardList;
    }

    @Override
    public Board select(int no) throws Exception {
        Board board = boardMapper.select(no);

        return board;
    }

    @Override
    public int insert(Board board) throws Exception {
        int result = boardMapper.insert(board);

        return result;
    }

    @Override
    public int update(Board board) throws Exception {
        int result = boardMapper.update(board);

        return result;
    }

    @Override
    public int delete(int no) throws Exception {
        int result = boardMapper.delete(no);

        return result;
    }

    @Override
    public int count() throws Exception {
        int count = boardMapper.count();
        return count;
    }
}
