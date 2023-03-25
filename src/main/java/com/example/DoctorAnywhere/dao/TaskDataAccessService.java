package com.example.DoctorAnywhere.dao;

import com.example.DoctorAnywhere.model.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("taskDao")
public class TaskDataAccessService implements TaskDao {
    private  static List<Task> DB = new ArrayList<>();

    @Override
    public int insertTask(Task task) {
        DB.add(new Task(task.getId(), task.getTitle(), task.getDescription(),
                task.isCompleted()));
        return 1;
    }

    @Override
    public List<Task> selectAllTasks() {
        return this.DB;
    }
}
