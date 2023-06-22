package com.pennant.prodmtr.Dao.Interface;

import java.util.List;

import com.pennant.prodmtr.model.Dto.PTFilterCriteria;
import com.pennant.prodmtr.model.Dto.ProjectTaskDTO;
import com.pennant.prodmtr.model.Entity.ProjectTask;

public interface ProjectTaskdao {
	ProjectTask save(ProjectTask projectTask);

	ProjectTask findById(int taskId);

	void delete(ProjectTask projectTask);

	List<ProjectTaskDTO> getProjectTaskDTOList();

	ProjectTaskDTO getProjectTaskById(int taskId);

	List<ProjectTaskDTO> filterTasks(PTFilterCriteria filterCriteria);

	// Other methods for fetching, updating, and deleting project tasks
}
