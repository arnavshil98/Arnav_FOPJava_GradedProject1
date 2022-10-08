package com.java.gl.dept;

public class HrDepartment extends SuperDepartment
{
	
public String departmentName() {
	return "Welcome to Hr Department";	
}
public String getTodaysWork() {
	return "Fill Todays timesheet and mark your attendance";
}
public String getWorkDeadlines() {
	return "Complete by EOD";
	
}
public String doActivity() {
	return "team Lunch";
}
public static void main(String[] args) {
		HrDepartment a=new HrDepartment();
		a.departmentName();
		a.getTodaysWork();
		a.getWorkDeadline();
		a.doActivity();
		a.isTodayaHoliday();		
}
}
