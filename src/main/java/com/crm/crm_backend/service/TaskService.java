package com.crm.crm_backend.service;

import org.springframework.stereotype.Service;

import com.crm.crm_backend.entity.Task;
import com.crm.crm_backend.repository.TaskRepository;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;


    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    public Task createTask(Task task) {
        return taskRepository.save(task);
    }


    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }


    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }


    public Task updateTask(Long id, Task task) {

        Task existingTask = taskRepository.findById(id).orElse(null);

        if (existingTask != null) {

            existingTask.setTitle(task.getTitle());
            existingTask.setDescription(task.getDescription());
            existingTask.setDueDate(task.getDueDate());
            existingTask.setStatus(task.getStatus());

            return taskRepository.save(existingTask);
        }

        return null;
    }


    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}