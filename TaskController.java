package com.example.task.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.task.model.Task;
import com.example.task.repository.TaskRepository;
import com.example.task.service.TaskService;

@RestController
public class TaskController{
	@Autowired
	TaskService taskservice;
	TaskRepository taskrepository;
	
	@PostMapping("/task")
	public String addTask(@RequestBody Task task) {
		taskservice.addTask(task);
		return "success";
	}
	
	@GetMapping("/task")
	public List<Task>getAllStatus(){
		return taskservice.getAllStatus();
	}
	@GetMapping("/task/{taskid}")
	public ResponseEntity<Task> getStatusById(@PathVariable int taskid) {
	Optional<Task> task = taskservice.getStatusById(taskid);
	if (task.isPresent()) {
	return new ResponseEntity<>(task.get(), HttpStatus.OK);
	} else {
	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	}
	
//	@GetMapping ("/task/{taskid}")
//	public Optional<Task> getStatusById(@PathVariable int taskid){
//		return taskservice.getStatusById(taskid);
//	}
	
	
}