package com.itheima.crm.staff.service;

import java.util.List;

import com.itheima.crm.staff.domain.CrmStaff;

public interface StaffService {
	
	public CrmStaff login(CrmStaff staff);
	
	public List<CrmStaff> findAllStaff();
	
	public CrmStaff findById(String staffId);

	public void updateStaff(CrmStaff staff);
}
