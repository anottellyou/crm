package com.itheima.crm.department.domain;

import java.util.HashSet;
import java.util.Set;

import com.itheima.crm.post.domain.CrmPost;

public class CrmDepartment {
	private String depId;
	private String depName;
	
	private Set<CrmPost> postSet = new HashSet<>();

	public String getDepId() {
		return depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public Set<CrmPost> getPostSet() {
		return postSet;
	}

	public void setPostSet(Set<CrmPost> postSet) {
		this.postSet = postSet;
	}
	
}
