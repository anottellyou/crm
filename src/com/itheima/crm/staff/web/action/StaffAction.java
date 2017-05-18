package com.itheima.crm.staff.web.action;

import java.util.List;

import com.itheima.crm.base.BaseAction;
import com.itheima.crm.department.domain.CrmDepartment;
import com.itheima.crm.department.service.DepartmentService;
import com.itheima.crm.staff.domain.CrmStaff;
import com.itheima.crm.staff.service.StaffService;
import com.opensymphony.xwork2.ActionContext;

public class StaffAction extends BaseAction<CrmStaff> {
	
	public String login(){
		CrmStaff findStaff = this.getStaffService().login(this.getModel());
		if(findStaff != null){
			putSession("loginStaff", findStaff);
			return "success";
		}
		//TODO 不成功
		this.addFieldError("", "用户名与密码不匹配");
		return "login";
	}
	
	public String home(){
		return "home";
	}
	
	public String findAll(){
		List<CrmStaff> allStaff = this.getStaffService().findAllStaff();
		
		put("allStaff",allStaff);
		
		return "findAll";
	}
	
	public String editUI(){
		CrmStaff findStaff = this.getStaffService().findById(getModel().getStaffId());
		
		ActionContext.getContext().getValueStack().push(findStaff);

		List<CrmDepartment> allDepartment = this.getDepartmentService().findAll();
		
		set("allDepartment", allDepartment);
		
		return "editUI";
	}
	
	public String edit(){
		this.getStaffService().updateStaff(this.getModel());
		return "edit";
	}
	
}
