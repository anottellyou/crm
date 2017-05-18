package com.itheima.crm.base;

import java.lang.reflect.ParameterizedType;

import com.itheima.crm.classes.service.ClassesService;
import com.itheima.crm.coursetype.dao.CourseTypeDao;
import com.itheima.crm.coursetype.service.CourseTypeService;
import com.itheima.crm.department.service.DepartmentService;
import com.itheima.crm.post.service.PostService;
import com.itheima.crm.staff.service.StaffService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BaseAction<T> extends ActionSupport implements ModelDriven<T> {

	private T t;
	
	@Override
	public T getModel() {
		return t;
	}

	public BaseAction(){
		try {
			ParameterizedType paramType = (ParameterizedType) this.getClass().getGenericSuperclass();
			Class<T> clazz = (Class<T>) paramType.getActualTypeArguments()[0];
			t = clazz.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	// spring注入service,多个
	private StaffService staffService;
	public StaffService getStaffService() {
		return staffService;
	}
	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}
	
	private PostService postService;
	public PostService getPostService() {
		return postService;
	}
	public void setPostService(PostService postService) {
		this.postService = postService;
	}

	private DepartmentService departmentService;
	public DepartmentService getDepartmentService() {
		return departmentService;
	}
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
	private CourseTypeService courseTypeService;
	public CourseTypeService getCourseTypeService() {
		return courseTypeService;
	}
	public void setCourseTypeService(CourseTypeService courseTypeService) {
		this.courseTypeService = courseTypeService;
	}
	
	private ClassesService classesService;
	public ClassesService getClassesService() {
		return classesService;
	}
	public void setClassesService(ClassesService classesService) {
		this.classesService = classesService;
	}
	
	//分页数据
	
	private int pageNum = 1;
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	private int pageSize = 2;
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public void push(Object obj){
		ActionContext.getContext().getValueStack().push(obj);
	}
	
	public void set(String key,Object obj){
		ActionContext.getContext().getValueStack().set(key, obj);
	}
	
	public void put(String key,Object value){
		ActionContext.getContext().put(key, value);	
	}
	
	public void putSession(String key ,Object value) {
		ActionContext.getContext().getSession().put(key, value);	
	}
	
	public void putApplication(String key ,Object value) {
		ActionContext.getContext().getApplication().put(key, value);	
	}
}
