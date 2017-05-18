package com.itheima.crm.classes.service.impl;

import java.util.List;

import com.itheima.crm.classes.dao.ClassesDao;
import com.itheima.crm.classes.domain.CrmClasses;
import com.itheima.crm.classes.service.ClassesService;

public class ClassesServiceImpl implements ClassesService {

	private ClassesDao classesDao;
	public void setClassesDao(ClassesDao classesDao) {
		this.classesDao = classesDao;
	}
	
	@Override
	public List<CrmClasses> findAll() {
		return classesDao.findAll();
	}

	@Override
	public CrmClasses findById(String classesId) {
		// TODO Auto-generated method stub
		return classesDao.findById(classesId);
	}

	@Override
	public void updateUpload(CrmClasses classes) {
		CrmClasses findClasses = this .classesDao.findById(classes.getClassId());
		findClasses.setUploadFilename(classes.getUploadFilename());
		findClasses.setUploadPath(classes.getUploadPath());
		findClasses.setUploadTime(classes.getUploadTime());
	}
	
	
}
