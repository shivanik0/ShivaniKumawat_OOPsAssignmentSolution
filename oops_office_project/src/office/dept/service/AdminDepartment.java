package office.dept.service;

import office.dept.model.SuperDepartment;

public class AdminDepartment extends SuperDepartment{

	private String deptName;
	private String work;
	private String deadline;

	//Constructor
	public AdminDepartment() {
		this.deptName = "Admin Department";
		this.work = "Complete your documents submission";
		this.deadline = "Complete by EOD";
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

}
