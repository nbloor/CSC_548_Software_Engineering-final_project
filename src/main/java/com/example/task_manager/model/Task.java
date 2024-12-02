package com.example.task_manager.model;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class Task {
    private static final AtomicInteger count = new AtomicInteger(0);
    private Integer id;
    private String description;
    private LocalDate dueDate;

    public Task() {
        this.id = count.incrementAndGet();
    }

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}