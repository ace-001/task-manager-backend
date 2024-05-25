package com.ace.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ace.taskmanager.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
