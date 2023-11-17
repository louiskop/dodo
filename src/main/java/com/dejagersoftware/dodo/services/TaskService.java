package com.dejagersoftware.dodo.services;

import java.time.Instant;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dejagersoftware.dodo.models.Task;
import com.dejagersoftware.dodo.repositories.TaskRepository;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Iterable<Task> getAll() {
        return taskRepository.findAll();
    }

    public Optional<Task> getById(Long id) {
        return taskRepository.findById(id);
    }

    public Task save(Task saveTask) {
        // if no id, create new
        if (saveTask.getId() == null) {
            saveTask.setCreatedAt(Instant.now());
        }
        // update
        saveTask.setUpdatedAt(Instant.now());

        return taskRepository.save(saveTask);
    }

    public void delete(Task deleteTask) {
        taskRepository.delete(deleteTask);
    }

}
