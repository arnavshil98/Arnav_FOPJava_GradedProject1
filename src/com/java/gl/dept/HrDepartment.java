package com.java.gl.dept;

public class HrDepartment extends SuperDepartment {

	@Override
	public String departmentName() {
		return "Welcome to Hr Department";
	}

	@Override
	public String getTodaysWork() {
		return "Fill Todays timesheet and mark your attendance";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";

	}

	public String doActivity() {
		return "team Lunch";

	}

}