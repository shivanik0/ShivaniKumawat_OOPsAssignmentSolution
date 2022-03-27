package office.dept.service;

import office.dept.model.SuperDepartment;

public class TechDepartment extends SuperDepartment {

	private String deptName;
	private String work;
	private String deadline;
	private String stackInfo;

	//Constructor
	public TechDepartment() {
		deptName = "Tech Department";
		work = "Complete coding of module 1";
		deadline = "Complete by EOD";
		stackInfo = "Core Java";
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
	public String getTechStackInformation() {
		return stackInfo;
	}

}