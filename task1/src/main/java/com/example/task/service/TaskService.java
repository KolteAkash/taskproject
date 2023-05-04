package com.example.task.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task.model.Task;
import com.example.task.repository.TaskRepository;

@Service
public class TaskService {
	@Autowired 
	TaskRepository taskrepository;
	
	
public void addTask(Task task)	{
	taskrepository.save(task);
}

public List<Task>getAllStatus(){
	return taskrepository.findAll();
}

public Optional<Task> getStatusById(int taskId) {
    Optional<Task> optionalTask = taskrepository.findById(taskId);
    return optionalTask;
}
	
public Task updateTask(int Id,Task task) {
	Optional<Task>existingTask = taskrepository.findById(Id);
	if(!existingTask.isPresent()) {
		return null;
	}
	Task updateTask = taskrepository.save(task);
	return updateTask;
}
	
public boolean deleteTask(int Id) {
    Optional<Task> existingTask = taskrepository.findById(Id);
    if (!existingTask.isPresent()) {
        return false;
    } else {
        taskrepository.deleteById(Id);
        return true;
    }
}
	
}