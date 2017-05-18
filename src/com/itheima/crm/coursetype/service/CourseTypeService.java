package com.itheima.crm.coursetype.service;

import java.util.List;

import com.itheima.crm.coursetype.domain.CrmCourseType;
import com.itheima.crm.page.PageBean;

public interface CourseTypeService {
	
	public List<CrmCourseType> findAll();
	
	public List<CrmCourseType> findAll(CrmCourseType courseType);
	
	public CrmCourseType findById(String courseTypeId);
	
	public void addOrEdit(CrmCourseType courseType);
	
	public PageBean<CrmCourseType> findAll(CrmCourseType courseType,int pageNum,int pageSize);
}
