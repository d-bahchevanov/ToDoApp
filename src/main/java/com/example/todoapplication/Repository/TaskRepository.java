package com.example.todoapplication.Repository;

import com.example.todoapplication.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
