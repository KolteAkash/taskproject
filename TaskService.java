package com.example.task.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task.model.Task;
import com.example.task.repository.TaskRepository;

@Service
public class TaskService{
	@Autowired 
	TaskRepository taskrepository;
	
	
public void addTask(Task task)	{
	taskrepository.save(task);
}

public List<Task>getAllStatus(){
	return taskrepository.findAll();
}

//public Optional<Task>getStatusById(int task){
//	return taskrepository.findById(task);
//}
public Optional<Task> getStatusById(int taskId) {
    Optional<Task> optionalTask = taskrepository.findById(taskId);
    return optionalTask;
}
	
	
	
	
	

}

