package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.model.HoistCellData;
@Repository
public class DashboardDao implements IDashboardDao{

	@Autowired
	DataSource datasource;



	public List<HoistCellData> getHoistCellData(){
		
		//Connection con=getConnection();
		List<HoistCellData> listIfHoist=new ArrayList<HoistCellData>();
		try{
		//PreparedStatement pstmt=con.prepareStatement("seect * from ");
		
		
		
		}catch(Exception e ){
			
		}
		
		
		
		
		
		HoistCellData obj1=new HoistCellData();
		obj1.setHours(1);
		obj1.setLocation("HC1001");
		obj1.setCommodity("battries");
		obj1.setMin(4);
		obj1.setActual(4);
		HoistCellData obj2=new HoistCellData();
		obj2.setHours(2);
		obj2.setLocation("HC1001");

		obj2.setCommodity("battries");
		obj2.setMin(5);
		obj2.setActual(5);
		HoistCellData obj3=new HoistCellData();
		obj3.setHours(3);
		obj3.setLocation("HC1002");

		obj3.setCommodity("battries");

		obj3.setMin(6);
		obj3.setActual(5);

		obj3.setLocation("HC1002");
		HoistCellData obj4=new HoistCellData();
        obj4.setHours(4);
        obj4.setLocation("HC1002");

		obj4.setCommodity("battries");
		obj4.setMin(3);
		obj4.setActual(5);


        listIfHoist.add(obj1);listIfHoist.add(obj2);

        listIfHoist.add(obj3);listIfHoist.add(obj4);

		return listIfHoist;
	}
	
	private Connection getConnection(){
		Connection con=null;
		try{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con = DriverManager.getConnection("jdbc:odbc:swing");
		}catch(Exception e){
			
		}
		return con;
		
	}
}
