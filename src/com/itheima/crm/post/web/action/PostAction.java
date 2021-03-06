package com.itheima.crm.post.web.action;

import java.io.IOException;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

import org.apache.struts2.ServletActionContext;

import com.itheima.crm.base.BaseAction;
import com.itheima.crm.post.domain.CrmPost;
import com.itheima.crm.post.service.PostService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class PostAction extends BaseAction<CrmPost> {

	public String findAllWithDepartment() throws IOException{ 
		List<CrmPost> allPost = this.getPostService().findAll(this.getModel().getDepartment());
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setExcludes(new String[]{"department","staffSet"});
		String jsonData = JSONArray.fromObject(allPost,jsonConfig).toString();
		
		ServletActionContext.getResponse().setContentType("text/html;charset=UTF-8");
		ServletActionContext.getResponse().getWriter().print(jsonData);
		
		return "none";
	}
}
