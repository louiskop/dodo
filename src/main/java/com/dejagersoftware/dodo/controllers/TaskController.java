package com.dejagersoftware.dodo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dejagersoftware.dodo.models.Task;
import com.dejagersoftware.dodo.services.TaskService;

import jakarta.validation.Valid;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("tasks", taskService.getAll());
        return modelAndView;
    }

    @GetMapping("/new")
    public String newTask(Task task) {
        return "newTask";
    }

    @PostMapping("/task")
    public String createTask(@Valid Task task, BindingResult result, Model model) {

        taskService.save(task);

        return "redirect:/";
    }

}
