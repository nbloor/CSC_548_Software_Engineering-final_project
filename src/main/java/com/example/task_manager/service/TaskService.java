package com.example.task_manager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.task_manager.model.Task;

@Service
public class TaskService {
    private final List<Task> tasks = new ArrayList<>();

    public List<Task> getAllTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Integer id) {
        tasks.removeIf(task -> task.getId().equals(id));
    }
}
