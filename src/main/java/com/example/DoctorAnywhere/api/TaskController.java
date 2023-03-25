package com.example.DoctorAnywhere.api;

import com.example.DoctorAnywhere.model.Task;
import com.example.DoctorAnywhere.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/v1/tasks")
@RestController
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public void addTask(@NonNull @RequestBody Task task) {
        taskService.addTask(task);
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping(path = "{id}")
    public Task getTaskById(@PathVariable("id") long id) {
        return taskService.getTaskById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deletePersonById(@PathVariable("id") long id) {
        taskService.deleteTask(id);
    }

    @PutMapping(path = "{id}")
    public void updatePerson(@PathVariable("id") long id,
                             @NonNull @RequestBody Task newTask) {
        taskService.updateTask(id, newTask);
    }

}
