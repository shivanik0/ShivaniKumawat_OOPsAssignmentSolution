package office.dept.main;

import java.util.Scanner;

import office.dept.model.SuperDepartment;
import office.dept.service.AdminDepartment;
import office.dept.service.HrDepartment;
import office.dept.service.TechDepartment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaring local variables
		int departmentNum,flag;
		Scanner scanner = new Scanner(System.in);

		//Creating objects of class
		SuperDepartment super_adm = new AdminDepartment();
		SuperDepartment super_hrd = new HrDepartment();
		SuperDepartment super_techd = new TechDepartment();

		SuperDepartment sd = new SuperDepartment();
		HrDepartment hrd = new HrDepartment();
		TechDepartment techd = new TechDepartment();

		//Menu
		do {
			flag=0;
			System.out.print("Enter Department Name:\n1. Admin\n2. Human Resources\n3. Tech\n4. Super Department\n\nYour selection:");
			departmentNum=scanner.nextInt();
			switch (departmentNum) {
			case 1:
				System.out.println("\nWelcome to "+super_adm.departmentName());
				System.out.println(super_adm.getTodaysWork());
				System.out.println(super_adm.getWorkDeadline());
				System.out.println(super_adm.isTodayAHoliday());
				break;
			case 2:
				System.out.println("\nWelcome to "+super_hrd.departmentName());
				System.out.println(hrd.doActivity());
				System.out.println(super_hrd.getTodaysWork());
				System.out.println(super_hrd.getWorkDeadline());
				System.out.println(super_hrd.isTodayAHoliday());
				break;
			case 3:
				System.out.println("\nWelcome to "+super_techd.departmentName());
				System.out.println(super_techd.getTodaysWork());
				System.out.println(super_techd.getWorkDeadline());
				System.out.println(techd.getTechStackInformation());
				System.out.println(super_techd.isTodayAHoliday());
				break;
			case 4:
				System.out.println("\nWelcome to "+sd.departmentName());
				System.out.println(sd.getTodaysWork());
				System.out.println(sd.getWorkDeadline());
				System.out.println(sd.isTodayAHoliday());
				break;
			default:
				System.out.println("Invalid selection! Please try again.\n");
				flag=1;
				break;
			}
		}while (flag==1);
		scanner.close();
	}

}

