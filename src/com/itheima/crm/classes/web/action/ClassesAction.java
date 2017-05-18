package com.itheima.crm.classes.web.action;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.itheima.crm.base.BaseAction;
import com.itheima.crm.classes.domain.CrmClasses;
import com.itheima.crm.utils.MyStringUtils;
import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

public class ClassesAction extends BaseAction<CrmClasses> {

	public String findAll(){
		List<CrmClasses> allClasses = this.getClassesService().findAll();
		this.set("allClasses", allClasses);
		return "findAll";
	}
	
	public String uploadUI(){
		CrmClasses findClasses = this.getClassesService().findById(this.getModel().getClassId());
		this.push(findClasses);
		
		return "uploadUI";
	}
	
	private File schedule;
	private String scheduleFileName;
	private String scheduleContentType;
	public void setSchedule(File schedule) {
		this.schedule = schedule;
	}
	public void setScheduleFileName(String scheduleFileName) {
		this.scheduleFileName = scheduleFileName;
	}
	public void setScheduleContentType(String scheduleContentType) {
		this.scheduleContentType = scheduleContentType;
	}
	
	@InputConfig(resultName="uploadInput")
	public String upload() throws IOException{
		
		String parentDir = ServletActionContext.getServletContext().getRealPath("/WEB-INF/upload");
		
		String fileName = MyStringUtils.getUUID();
		
		FileUtils.copyFile(schedule, new File(parentDir,fileName));
		
		this.getModel().setUploadTime(new Date());
		this.getModel().setUploadPath("/WEB-INF/upload" + fileName);
		this.getModel().setUploadFilename(scheduleFileName);
		this.getClassesService().updateUpload(this.getModel());
		
		return "upload";
	}
	
}
