package com.pennant.prodmtr.Dao.Impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.pennant.prodmtr.Dao.Interface.SprintDAO;
import com.pennant.prodmtr.model.Dto.SprintDto;
import com.pennant.prodmtr.model.Entity.Sprint;

@Component
public class SprintDAOImpl implements SprintDAO {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Sprint getSprintById(int sprintId) {
		return entityManager.find(Sprint.class, sprintId);
	}

	@Override
	public List<Sprint> getAllSprints() {
		String jpql = "SELECT s FROM Sprint s";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

	@Override
	@Transactional
	public void createSprint(Sprint sprint) {
		entityManager.persist(sprint);
	}

	@Override
	@Transactional
	public void updateSprint(Sprint sprint) {
		entityManager.merge(sprint);
	}

	@Override
	@Transactional
	public void deleteSprint(int sprintId) {
		Sprint sprint = entityManager.find(Sprint.class, sprintId);
		if (sprint != null) {
			entityManager.remove(sprint);
		}
	}

	@Override
	public List<SprintDto> getSprintbyprojectId(Integer projectId) {
		short getProjectId = projectId.shortValue();
		TypedQuery<Sprint> query = entityManager
				.createQuery("SELECT s FROM Sprint s WHERE s.project.projectId = :proj_id", Sprint.class);
		query.setParameter("proj_id", getProjectId);
		List<Sprint> sprints = query.getResultList();

		List<SprintDto> sprintDTOList = new ArrayList<>();

		for (Sprint sprint : sprints) {
			SprintDto Sprintdto = SprintDto.fromEntity(sprint);
			sprintDTOList.add(Sprintdto);
		}

		return sprintDTOList;
	}
}
