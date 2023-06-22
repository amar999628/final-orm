package com.pennant.prodmtr.service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pennant.prodmtr.Dao.Impl.FunctionalunitDAOImpl;
import com.pennant.prodmtr.model.Dto.FunctionalUnitdto;
import com.pennant.prodmtr.model.Entity.FunctionalUnit;
import com.pennant.prodmtr.model.Input.FunctionalUnitinput;

@Service
@Transactional
public class FunctionalUnitServiceImpl {
	private final FunctionalunitDAOImpl funitDao;

	@Autowired
	public FunctionalUnitServiceImpl(FunctionalunitDAOImpl funitDAO) {
		this.funitDao = funitDAO;
	}

	public List<FunctionalUnitdto> getFunctionalunitByModId(Integer modId) {
		return funitDao.getFunctionalunitByModId(modId);
	}

	public void createFunit(FunctionalUnitinput funitinput) {
		// Additional business logic, if needed

		FunctionalUnit funit = funitinput.toEntity();
		funitDao.save(funit);

	}

	// public void createFunit(FunitInput funitinput) {
	// // Additional business logic, if needed
	//
	// FunctionalUnit funit = funitinput.toEntity();
	// funitDao.save(funit);
	//
	// }

}
