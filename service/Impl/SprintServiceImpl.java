package com.pennant.prodmtr.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.pennant.prodmtr.Dao.Interface.SprintDAO;
import com.pennant.prodmtr.model.Dto.SprintDto;
import com.pennant.prodmtr.model.Entity.Sprint;

@Component
@Transactional

public class SprintServiceImpl {

	@Autowired
	private SprintDAO sprintDAO;

	public Sprint getSprintById(int sprintId) {
		return sprintDAO.getSprintById(sprintId);
	}

	public List<Sprint> getAllSprints() {
		return sprintDAO.getAllSprints();
	}

	public void createSprint(Sprint sprint) {
		sprintDAO.createSprint(sprint);
	}

	public void updateSprint(Sprint sprint) {
		sprintDAO.updateSprint(sprint);
	}

	public void deleteSprint(int sprintId) {
		sprintDAO.deleteSprint(sprintId);
	}

	public List<SprintDto> getSprintbyprojectId(Integer projectId) {
		return sprintDAO.getSprintbyprojectId(projectId);
	}
}
