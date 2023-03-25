package com.example.DoctorAnywhere.dao;

import com.example.DoctorAnywhere.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskDao {
    int insertTask(Task task);

    List<Task> selectAllTasks();

    Optional<Task> selectTaskById(long id);
    int deleteTaskById(Long id);
    int updateTaskById(Long id, Task task);
}
