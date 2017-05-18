package com.itheima.crm.staff.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.itheima.crm.base.impl.BaseDaoImpl;
import com.itheima.crm.staff.dao.StaffDao;
import com.itheima.crm.staff.domain.CrmStaff;

public class StaffDaoImpl extends BaseDaoImpl<CrmStaff> implements StaffDao {
	@Override
	public CrmStaff find(String loginName, String loginPwd) {
		// TODO Auto-generated method stub
		List<CrmStaff> allStaff = this.getHibernateTemplate().find("from CrmStaff where loginName=? and loginPwd=?", loginName,loginPwd);
//		System.out.println(loginPwd);
//		System.out.println(allStaff.size());
		if(allStaff.size() == 1){
			return allStaff.get(0);
		}
		return null;
	}
}
