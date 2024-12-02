package com.example.task_manager.Controller;


import com.example.task_manager.model.Task;
import com.example.task_manager.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public String getTasks(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        model.addAttribute("newTask", new Task());
        return "tasks";
    }

    @GetMapping("/delete")
    public String deleteTask(@RequestParam("id") Integer id) {
        taskService.removeTask(id);
    return "redirect:/";
    }

    @PostMapping("/add")
    public String addTask(@ModelAttribute Task task) {
        taskService.addTask(task);
        return "redirect:/";
    }
}
