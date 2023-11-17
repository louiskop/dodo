package com.dejagersoftware.dodo.models;

import java.io.Serializable;
import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tasks")
public class Task implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String description;
    private Boolean isComplete;
    private Instant createdAt;
    private Instant dueDate;

    @Override
    public String toString() {
        return String.format("TODO:%s, isComplete: %s", name, isComplete);
    }

}
