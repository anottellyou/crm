package com.itheima.crm.staff.dao;

import java.util.List;

import com.itheima.crm.base.BaseDao;
import com.itheima.crm.staff.domain.CrmStaff;

public interface StaffDao extends BaseDao<CrmStaff>{
	public CrmStaff find(String loginName,String loginPwd);
	
}
