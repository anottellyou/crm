package com.itheima.crm.post.dao.impl;

import java.util.List;

import com.itheima.crm.base.impl.BaseDaoImpl;
import com.itheima.crm.department.domain.CrmDepartment;
import com.itheima.crm.post.dao.PostDao;
import com.itheima.crm.post.domain.CrmPost;

public class PostDaoImpl extends BaseDaoImpl<CrmPost> implements PostDao {

	@Override
	public List<CrmPost> findAll(CrmDepartment department) {
		return this.getHibernateTemplate().find("from CrmPost where department = ?",department);
	}

}
