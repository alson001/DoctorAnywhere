package com.example.DoctorAnywhere.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

public class Task {
    @NonNull
    private Long id;
    @NonNull
    private String title;
    private String description;
    private boolean completed;

    public Task(@JsonProperty("id") Long id,
                @JsonProperty("title") String title,
                @JsonProperty("description") String description,
                @JsonProperty("completed") boolean completed) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }
}
