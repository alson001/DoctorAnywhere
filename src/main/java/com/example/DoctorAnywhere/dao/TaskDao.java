package com.example.DoctorAnywhere.dao;

import com.example.DoctorAnywhere.model.Task;

import java.util.List;

public interface TaskDao {
    int insertTask(Task task);

    List<Task> selectAllTasks();
}
