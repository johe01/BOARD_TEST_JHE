package com.aloha.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aloha.board.domain.Board;
import com.aloha.board.domain.Page;
import com.aloha.board.service.BoardService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.bind.annotation.PostMapping;



@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {
    
    @Autowired
    private BoardService boardService;

    @GetMapping("/list")
    public String list(Model model, Page page) throws Exception{

        List<Board> boardList = boardService.list(page);

        log.info("first:"+page.getFirst());
        log.info("prev:"+page.getPrev());
        log.info("next:"+page.getNext());
        log.info("last:"+page.getLast());
        log.info("start:"+page.getStart());
        log.info("end:"+page.getEnd());
        
        
        model.addAttribute("page", page);
        model.addAttribute("boardList", boardList);
        model.addAttribute("rows", page.getRows());

        return "board/list";
    }

    @GetMapping("/insert")
    public String insertGet() {

        return "board/insert";
    }
    
    @PostMapping("/insert")
    public String insertPost(Board board) throws Exception {
        int result = boardService.insert(board);

        if (result > 0) {
            return "redirect:/board/list";
        }
        
        return "redirect:/board/insert?error";  
    }
    

    @GetMapping("/read")
    public String getMethodName(@RequestParam("no") int no, Model model) throws Exception {

        Board board = boardService.select(no);

        model.addAttribute("board", board);

        return "board/read";
    }

    @GetMapping("/update")
    public String updateGet(@RequestParam("no") int no, Model model) throws Exception {

        Board board = boardService.select(no);

        model.addAttribute("board", board);

        return "board/update";
    }
    
    @PostMapping("/update")
    public String updatePost(Board board) throws Exception {
        int result = boardService.update(board);

        if( result > 0 ) {
            return "redirect:/board/list";
        }
        int no = board.getNo();
        return "redirect:/board/update?no="+ no + "&error";
        
    }

    @PostMapping("/delete")
    public String delete(Board board) throws Exception {
        int no = board.getNo();
        int result = boardService.delete(no);
        if( result > 0 ) {
            return "redirect:/board/list";
        }
        return "redirect:/board/update?no=" + no + "&error";
    }
    
}
