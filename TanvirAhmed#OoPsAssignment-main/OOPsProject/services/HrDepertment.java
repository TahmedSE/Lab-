package com.greatlearning.services;

import com.greatlearning.services.SuperDepartment;

public class HrDepertment extends SuperDepartment {
	public String departmentName() {
		String s = "Welcome to HR Department";
		System.out.println(s);
		return s;
	}

	public String getTodaysWork() {
		String s = "Fill today's worksheet and mark your attendance";
		System.out.println(s);
		return s;
	}

	public String getWorkDeadline() {
		String s = "Complete by EOD";
		System.out.println(s);
		return s;
	}

	public String doActivity() {
		String s = "team Lunch";
		System.out.println(s);
		return s;
	}

}
