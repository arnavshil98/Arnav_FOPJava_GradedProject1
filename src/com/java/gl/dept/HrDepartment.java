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
	System.out.println(a.departmentName());	
	System.out.println(a.getTodaysWork());	
	System.out.println(a.getWorkDeadline());
	System.out.println(a.doActivity());
	System.out.println(a.isTodayAHoliday());		
}
}

