package com.pennant.prodmtr.Dao.Interface;

import java.util.List;

import com.pennant.prodmtr.model.Dto.ResTaskFilter;
import com.pennant.prodmtr.model.Dto.TaskDto;
import com.pennant.prodmtr.model.Entity.Task;

public interface TaskDao {
	List<TaskDto> viewTasksForUser(int userId);

	List<TaskDto> getTasksByUserId(int userId);

	List<TaskDto> getAllTasks();

	List<TaskDto> filterTasks(ResTaskFilter resTaskFilter);

	Task getTaskById(int taskId);

	void saveTask(Task task);

	boolean updateStatus(int taskId);

	int getCompletedTasksByUserId(int userId);

	int getTotalTasksByUserId(int userId);

	double getHoursWorkedByUserId(int userId);

	// Other methods for task-related operations
}
