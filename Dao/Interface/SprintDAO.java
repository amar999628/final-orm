package com.pennant.prodmtr.Dao.Interface;

import java.util.List;

import com.pennant.prodmtr.model.Dto.SprintDto;
import com.pennant.prodmtr.model.Entity.Sprint;

public interface SprintDAO {
	Sprint getSprintById(int sprintId);

	List<Sprint> getAllSprints();

	void createSprint(Sprint sprint);

	void updateSprint(Sprint sprint);

	void deleteSprint(int sprintId);

	List<SprintDto> getSprintbyprojectId(Integer projectId);

}
