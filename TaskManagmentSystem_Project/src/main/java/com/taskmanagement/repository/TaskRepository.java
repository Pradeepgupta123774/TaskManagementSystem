package com.taskmanagement.repository;



import com.taskmanagement.model.Task;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
	
	List<Task> findByCompleted(boolean completed);


}
