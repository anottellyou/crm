package com.itheima.crm.post.service;

import java.util.List;

import com.itheima.crm.department.domain.CrmDepartment;
import com.itheima.crm.post.domain.CrmPost;

public interface PostService {
	public List<CrmPost> findAll(CrmDepartment department);
}
