package com.app.model;

public class HoistCellData {

	public HoistCellData(){
		
		
	}
	
	private int hours;
	private String location;
	private String commodity;
	private int min;
	private int actual;
	private int cumulative;
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCommodity() {
		return commodity;
	}
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getActual() {
		return actual;
	}
	public void setActual(int actual) {
		this.actual = actual;
	}
	public int getCumulative() {
		return cumulative;
	}
	public void setCumulative(int cumulative) {
		this.cumulative = cumulative;
	}
	
}
