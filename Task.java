package com.example.task.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Task{
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;
	
	@Column(name="task_type_id")
	private String task_type_id;
	
	@Column(name="task_summary")
	private String task_summary;

	@Column(name="task_details")
	private String task_details;
	
	@Column(name="start_time")
	private String start_time;
	
	@Column(name="end_time")
	private String end_time;
	
	@Column(name="project_id")
	private int project_id;
	
	@Column(name="created_by")
	private String created_by;
	
	@Column(name="user_id")
	private String user_id;
	
	@Column(name="user_name")
	private String user_name;
	
	@Column(name="client_id")
	private String client_id;
	
	@Column(name="parent_task_id")
	private String parent_task_id;
	
	@Column(name="sub_parent_task_id")
	private String sub_parent_task_id;
	
	@Column(name="project_status_id")
	private int project_status_id;
	
	@Column(name="priority_id")
	private int priority_id;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getTask_type_id() {
		return task_type_id;
	}

	public void setTask_type_id(String task_type_id) {
		this.task_type_id = task_type_id;
	}

	public String getTask_summary() {
		return task_summary;
	}

	public void setTask_summary(String task_summary) {
		this.task_summary = task_summary;
	}

	public String getTask_details() {
		return task_details;
	}

	public void setTask_details(String task_details) {
		this.task_details = task_details;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getParent_task_id() {
		return parent_task_id;
	}

	public void setParent_task_id(String parent_task_id) {
		this.parent_task_id = parent_task_id;
	}

	public String getSub_parent_task_id() {
		return sub_parent_task_id;
	}

	public void setSub_parent_task_id(String sub_parent_task_id) {
		this.sub_parent_task_id = sub_parent_task_id;
	}

	public int getProject_status_id() {
		return project_status_id;
	}

	public void setProject_status_id(int project_status_id) {
		this.project_status_id = project_status_id;
	}

	public int getPriority_id() {
		return priority_id;
	}

	public void setPriority_id(int priority_id) {
		this.priority_id = priority_id;
	}

	
	
	
}