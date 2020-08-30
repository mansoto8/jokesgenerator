package com.springcourse.jokes.jokesgenerator.controllers;

import com.springcourse.jokes.jokesgenerator.services.JokesService;
import org.springframework.stereotype.Controller;
import com.springcourse.jokes.jokesgenerator.services.JokesServiceImpl;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class JokesController {

    private JokesService jokesService;

    public JokesController(JokesService jokesService){
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String getJokes(Model model){
        model.addAttribute("joke", jokesService.getJoke());

        return "jokes";
    }
}
