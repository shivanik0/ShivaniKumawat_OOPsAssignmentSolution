package office.dept.service;

import office.dept.model.SuperDepartment;

public class HrDepartment extends SuperDepartment{

	private String deptName;
	private String work;
	private String deadline;
	private String activity;

	//Constructor
	public HrDepartment() {
		deptName = "HR Department";
		work = "Fill today’s worksheet and mark your attendance";
		deadline = "Complete by EOD";
		activity = "Team Lunch";
	}

	//Methods
	public String departmentName() {
		return deptName;
	}
	public String getTodaysWork() {
		return work;
	}
	public String getWorkDeadline() {
		return deadline;
	}
	public String doActivity() {
		return activity;
	}

}
