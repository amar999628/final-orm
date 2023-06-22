package com.pennant.prodmtr.service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pennant.prodmtr.Dao.Interface.ModuleDAO;
import com.pennant.prodmtr.model.Dto.ModuleDTO;
import com.pennant.prodmtr.model.Entity.Module;
import com.pennant.prodmtr.model.Input.ModuleInput;

@Service
@Transactional
public class ModuleServiceImpl {
	private final ModuleDAO moduleDao;

	@Autowired
	public ModuleServiceImpl(ModuleDAO moduleDAO) {
		this.moduleDao = moduleDAO;
	}

	public List<ModuleDTO> getModuleByProjId(Integer projId) {
		return moduleDao.getModuleDetailsByProjId(projId);
	}

	public void createModule(ModuleInput moduleinput) {
		// Additional business logic, if needed

		Module module = moduleinput.toEntity();
		moduleDao.save(module);

	}

}
