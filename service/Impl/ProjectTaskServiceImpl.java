package com.pennant.prodmtr.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pennant.prodmtr.Dao.Interface.ProjectTaskdao;
import com.pennant.prodmtr.model.Dto.PTFilterCriteria;
import com.pennant.prodmtr.model.Dto.ProjectTaskDTO;
import com.pennant.prodmtr.model.Entity.ProjectTask;

@Service
public class ProjectTaskServiceImpl {
	private final ProjectTaskdao projectTaskdao;

	@Autowired
	public ProjectTaskServiceImpl(ProjectTaskdao projectTaskdao) {
		this.projectTaskdao = projectTaskdao;
	}

	public ProjectTask createProjectTask(ProjectTask projectTask) {
		// Additional business logic, if needed
		return projectTaskdao.save(projectTask);
	}

	// public List<ProjectTask> getAllProjectTasks() {
	// return projectTaskdao.getProjectTaskDTOList();
	// }

	public List<ProjectTaskDTO> getProjectTaskDTOList() {
		// TODO Auto-generated method stub
		return projectTaskdao.getProjectTaskDTOList();
	}

	public ProjectTaskDTO getProjectTaskById(int taskId) {
		// TODO Auto-generated method stub
		return projectTaskdao.getProjectTaskById(taskId);
	}

	public List<ProjectTaskDTO> filterTasks(PTFilterCriteria filterCriteria) {

		return projectTaskdao.filterTasks(filterCriteria);
	}

	// Other service methods for updating, deleting project tasks
}