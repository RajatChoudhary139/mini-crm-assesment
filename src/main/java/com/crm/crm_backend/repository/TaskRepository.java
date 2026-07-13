package com.crm.crm_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crm.crm_backend.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}