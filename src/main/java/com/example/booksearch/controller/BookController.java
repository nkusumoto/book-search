package com.example.booksearch.controller;

import com.example.booksearch.dao.BookDao;
import com.example.booksearch.domain.ApiResponse;
import com.example.booksearch.domain.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("")
public class BookController {

    private BookDao bookDao;

    public BookController(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @GetMapping(path = "/index")
    public String index(){
        return "index";
    }

    @GetMapping(path = "/search_result")
    public String search(@RequestParam(name = "query", required = false) String query, Model model){
        ApiResponse result = bookDao.getBooks(query);
        List<Item> items = result.getItems();
        model.addAttribute("items", items);
        return "search result";
    }

}
