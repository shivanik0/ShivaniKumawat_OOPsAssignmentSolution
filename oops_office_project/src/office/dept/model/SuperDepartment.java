package office.dept.model;

public class SuperDepartment {

	private String deptName;
	private String work;
	private String deadline;
	private String holidayStatus;

	//Constructor
	public SuperDepartment (){
		deptName="Super Department";
		work="No Work as of now";
		deadline="Nil";
		holidayStatus="Today is not a Holiday";
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
	public String isTodayAHoliday() {
		return holidayStatus;
	}

}
