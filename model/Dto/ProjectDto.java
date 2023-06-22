package com.pennant.prodmtr.model.Dto;

import java.util.Date;
import java.util.List;

import com.pennant.prodmtr.model.Entity.Project;

public class ProjectDto {
	private short projectId;
	private String projectName;
	private String projectDescription;
	private Date projectStartDate;
	private String projectManagerName;
	private String projectStatus;
	private Date projectLastUpdatedDate;
	private List<TaskDto> tasks; // Add this property to hold the tasks

	// Getter and Setter methods for existing properties

	public List<TaskDto> getTasks() {
		return tasks;
	}

	public void setTasks(List<TaskDto> tasks) {
		this.tasks = tasks;
	}

	public short getProjectId() {
		return projectId;
	}

	public void setProjectId(short projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public Date getProjectStartDate() {
		return projectStartDate;
	}

	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	public String getProjectManagerName() {
		return projectManagerName;
	}

	public void setProjectManagerName(String projectManagerName) {
		this.projectManagerName = projectManagerName;
	}

	public String getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

	public Date getProjectLastUpdatedDate() {
		return projectLastUpdatedDate;
	}

	public void setProjectLastUpdatedDate(Date projectLastUpdatedDate) {
		this.projectLastUpdatedDate = projectLastUpdatedDate;
	}

	public static ProjectDto fromEntity(Project project) {
		ProjectDto projectDto = new ProjectDto();
		projectDto.setProjectId(project.getProjectId());
		projectDto.setProjectName(project.getProjectName());
		projectDto.setProjectDescription(project.getProjectDescription());
		projectDto.setProjectStartDate(project.getProjectStartDate());
		projectDto.setProjectManagerName(project.getProjectManager().getUserDisplayName());
		projectDto.setProjectStatus(project.getProjectStatus());
		projectDto.setProjectLastUpdatedDate(project.getProjectLastUpdatedDate());
		return projectDto;
	}
}
