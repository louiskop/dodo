package com.dejagersoftware.dodo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dejagersoftware.dodo.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
