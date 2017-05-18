package com.itheima.crm.coursetype.web.action;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.itheima.crm.base.BaseAction;
import com.itheima.crm.coursetype.domain.CrmCourseType;
import com.itheima.crm.coursetype.service.CourseTypeService;
import com.itheima.crm.page.PageBean;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CourseTypeAction extends BaseAction<CrmCourseType> {

	public String findAll(){
		/*
		List<CrmCourseType> allCourseType = this.courseTypeService.findAll();
		
		ActionContext.getContext().put("allCourseType", allCourseType);
		*/
		
		/*条件查询
		List<CrmCourseType> allCourseType = this.courseTypeService.findAll(courseType);
		ActionContext.getContext().put("allCourseType", allCourseType);
		*/
		
		/**
		 * 分页+条件
		 */
		PageBean<CrmCourseType> pageBean = this.getCourseTypeService().findAll(getModel(),getPageNum(),getPageSize());
		ActionContext.getContext().put("pageBean", pageBean);
		return "findAll";
	}
	
	public String addOrEditUI(){
		if(StringUtils.isNotBlank(getModel().getCourseTypeId())){
			CrmCourseType findCourseType = this.getCourseTypeService().findById(this.getModel().getCourseTypeId());
			push(findCourseType);
		}
		
		return "addOrEditUI";
	}
	
	public String addOrEdit(){
		this.getCourseTypeService().addOrEdit(getModel());
		return "addOrEdit";
	}
	
}
