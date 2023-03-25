package com.example.DoctorAnywhere.dao;

import com.example.DoctorAnywhere.model.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Task> selectTaskById(long id) {
        return DB.stream()
                .filter(task -> task.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deleteTaskById(Long id) {
        Optional<Task> taskMaybe = selectTaskById(id);
        if (taskMaybe.isEmpty()) {
            return 0;
        }
        DB.remove(taskMaybe.get());
        return 1;
    }

    @Override
    public int updateTaskById(Long id, Task newTask) {
        return selectTaskById(id)
                .map(task1 -> {
                    int indexOfTaskToUpdate = DB.indexOf(task1);
                    long newId;
                    if (newTask.getId() == null) {
                        newId = id;
                    } else {
                        newId = newTask.getId();
                    }
                    if (indexOfTaskToUpdate >= 0) {
                        DB.set(indexOfTaskToUpdate, new Task(newId,
                                newTask.getTitle(), newTask.getDescription(),
                                newTask.isCompleted()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }


}
