package com.example.newboard.test.controller;

import com.example.newboard.domain.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {
    @GetMapping("article")
    public String ArticleForm(Model model) {
        Model article = model.addAttribute("article", new Article());
        return "form"; // form.html
    }
}
