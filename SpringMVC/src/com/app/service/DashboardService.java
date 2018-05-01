package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IDashboardDao;
import com.app.model.HoistCellData;

@Service
public class DashboardService implements IDashboardService{

	@Autowired
	IDashboardDao dashboardDao;
	public List<HoistCellData> getHoistCellDataInfo(){
		return dashboardDao.getHoistCellData();
	}
	
	

	
}
