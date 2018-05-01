package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.HoistCellData;

import com.app.service.IDashboardService;

@Controller
public class DashboardController {

	@Autowired
	IDashboardService iDashboardService;
	@RequestMapping(value = "/viewData", method = {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView getData(){
		System.out.println("Entered into Controller");
		List<HoistCellData> listOfData=iDashboardService.getHoistCellDataInfo();
		ModelAndView view=new ModelAndView("ViewData");
		view.addObject("result",listOfData);
		return view;

		}
	}

