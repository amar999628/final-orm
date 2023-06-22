package com.pennant.prodmtr.service.Interface;

import java.util.List;

import com.pennant.prodmtr.model.Dto.PTFilterCriteria;
import com.pennant.prodmtr.model.Dto.ProjectTaskDTO;
import com.pennant.prodmtr.model.Entity.ProjectTask;

public interface ProjectTaskService {
	ProjectTask createProjectTask(ProjectTask projectTask);

	List<ProjectTaskDTO> getProjectTaskDTOList();

	ProjectTaskDTO getProjectTaskById(int taskId);

	List<ProjectTaskDTO> filterTasks(PTFilterCriteria filterCriteria);
}
