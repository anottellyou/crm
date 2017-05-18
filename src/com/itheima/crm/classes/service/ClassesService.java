package com.itheima.crm.classes.service;

import java.util.List;

import com.itheima.crm.classes.domain.CrmClasses;

public interface ClassesService {
	public List<CrmClasses> findAll();
	
	public CrmClasses findById(String classesId);

	public void updateUpload(CrmClasses model);
}
