package com.itheima.crm.coursetype.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.itheima.crm.coursetype.dao.CourseTypeDao;
import com.itheima.crm.coursetype.domain.CrmCourseType;
import com.itheima.crm.coursetype.service.CourseTypeService;
import com.itheima.crm.page.PageBean;


public class CourseTypeServiceImpl implements CourseTypeService {
	private CourseTypeDao courseTypeDao;
	public void setCourseTypeDao(CourseTypeDao courseTypeDao) {
		this.courseTypeDao = courseTypeDao;
	}
	
	@Override
	public List<CrmCourseType> findAll() {	
		return courseTypeDao.findAll();
	}

	@Override
	public List<CrmCourseType> findAll(CrmCourseType courseType) {
		
		StringBuilder builder = new StringBuilder();
		List<Object> paramsList = new ArrayList<>();
		
		if(StringUtils.isNotBlank(courseType.getCourseName())){
			builder.append(" and courseName like ?");
			paramsList.add("%" + courseType.getCourseName() +"%");
		}
		
		if(StringUtils.isNotBlank(courseType.getRemark())){
			builder.append(" and courseName like ?");
			paramsList.add("%" + courseType.getRemark() +"%");
		}
		
		if(StringUtils.isNotBlank(courseType.getTotalStart())){
			builder.append(" and total >= ?");
			paramsList.add(Integer.parseInt(courseType.getTotalStart()));
		}
		
		if(StringUtils.isNotBlank(courseType.getTotalEnd())){
			builder.append(" and total <= ?");
			paramsList.add(Integer.parseInt(courseType.getTotalEnd()));
		}
		
		if(StringUtils.isNotBlank(courseType.getCourseCostStart())){
			builder.append(" and courseCost >= ?");
			paramsList.add(Double.parseDouble(courseType.getCourseCostStart()));
		}
		
		if(StringUtils.isNotBlank(courseType.getCourseCostEnd())){
			builder.append(" and courseCost <= ?");
			paramsList.add(Double.parseDouble(courseType.getCourseCostEnd()));
		}
		
		String condition = builder.toString();
		Object[] params = paramsList.toArray();
		
		return courseTypeDao.findAll(condition, params);
	}

	@Override
	public CrmCourseType findById(String courseTypeId) {
		return courseTypeDao.findById(courseTypeId);
	}

	@Override
	public void addOrEdit(CrmCourseType courseType) {
		courseTypeDao.saveOrUpdate(courseType);
	}

	@Override
	public PageBean<CrmCourseType> findAll(CrmCourseType courseType, int pageNum,
			int pageSize) {
		
		StringBuilder builder = new StringBuilder();
		List<Object> paramsList = new ArrayList<>();
		
		if(StringUtils.isNotBlank(courseType.getCourseName())){
			builder.append(" and courseName like ?");
			paramsList.add("%" + courseType.getCourseName() +"%");
		}
		
		if(StringUtils.isNotBlank(courseType.getRemark())){
			builder.append(" and courseName like ?");
			paramsList.add("%" + courseType.getRemark() +"%");
		}
		
		if(StringUtils.isNotBlank(courseType.getTotalStart())){
			builder.append(" and total >= ?");
			paramsList.add(Integer.parseInt(courseType.getTotalStart()));
		}
		
		if(StringUtils.isNotBlank(courseType.getTotalEnd())){
			builder.append(" and total <= ?");
			paramsList.add(Integer.parseInt(courseType.getTotalEnd()));
		}
		
		if(StringUtils.isNotBlank(courseType.getCourseCostStart())){
			builder.append(" and courseCost >= ?");
			paramsList.add(Double.parseDouble(courseType.getCourseCostStart()));
		}
		
		if(StringUtils.isNotBlank(courseType.getCourseCostEnd())){
			builder.append(" and courseCost <= ?");
			paramsList.add(Double.parseDouble(courseType.getCourseCostEnd()));
		}
		
		String condition = builder.toString();
		Object[] params = paramsList.toArray();
		
		int totalRecord = this.courseTypeDao.getTotalRecord(condition,params);
		PageBean<CrmCourseType> pageBean = new PageBean<CrmCourseType>(pageNum,pageSize,totalRecord);
		
		List<CrmCourseType> data = this.courseTypeDao.findAll(condition,params,pageBean.getStartIndex(),pageBean.getPageSize());
		
		pageBean.setData(data);
		
		return pageBean;
	}

}
