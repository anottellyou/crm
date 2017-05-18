package com.itheima.crm.staff.service.impl;

import java.util.List;

import com.itheima.crm.staff.dao.StaffDao;
import com.itheima.crm.staff.domain.CrmStaff;
import com.itheima.crm.staff.service.StaffService;
import com.itheima.crm.utils.MyStringUtils;

public class StaffServiceImpl implements StaffService {
	private StaffDao staffDao;
	public void setStaffDao(StaffDao staffDao) {
		this.staffDao = staffDao;
	}
	@Override
	public CrmStaff login(CrmStaff staff) {
		String loginPwd = MyStringUtils.getMD5Value(staff.getLoginPwd());
		return staffDao.find(staff.getLoginName(), loginPwd);
	}
	@Override
	public List<CrmStaff> findAllStaff() {
		return staffDao.findAll();
	}
	@Override
	public CrmStaff findById(String staffId) {
		return staffDao.findById(staffId);
	}
	@Override
	public void updateStaff(CrmStaff staff) {
		CrmStaff findStaff = staffDao.findById(staff.getStaffId());
		if(! findStaff.getLoginPwd().equals(staff.getLoginPwd())){
			findStaff.setLoginPwd(MyStringUtils.getMD5Value(staff.getLoginPwd()));
		}
		findStaff.setLoginName(staff.getLoginName());
		findStaff.setStaffName(staff.getStaffName());
		findStaff.setGender(staff.getGender());
		findStaff.setOnDutyDate(staff.getOnDutyDate());
		findStaff.setPost(staff.getPost());
		
//		staffDao.upda
	}

}
