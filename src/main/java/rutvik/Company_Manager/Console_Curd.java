package rutvik.Company_Manager;

import java.util.Scanner;

public class Console_Curd {

	Scanner sc = new Scanner(System.in);
	Company comp = Company.getInstance();

	public void addEmp() {
		System.out.println("Enter the Id: ");
		int id = sc.nextInt();
		System.out.println("Enter the Name: ");
		String name = sc.next();
		System.out.println("Enter the Salary: ");
		int salary = sc.nextInt();
		Employee Emp = new Employee(id, name, salary);
		comp.getEmployeeslist().add(Emp);
		System.out.println("Added Successfully");

	}

	public void delEmp() {
		System.out.print("Enter the Id: ");
		int id = sc.nextInt();

		boolean flag = false;

		for (int i = 0; i < comp.getEmployeeslist().size(); ++i) {
			Employee a = comp.getEmployeeslist().get(i);
			int A = a.getId();
			{
				if (A == id) {
					flag = true;
					comp.getEmployeeslist().remove(i);
					System.out.println("Deleted Successfully");
					break;
				}
			}

		}

		if (!flag) {
			System.out.println("Failed : Invalide Id");
		}
	}

	public void showEmp() {
		System.out.println("Enter the ID: ");
		int id = sc.nextInt();

		boolean flag = false;
		for (int i = 0; i < comp.getEmployeeslist().size(); i++) {
			Employee a = comp.getEmployeeslist().get(i);
			int A = a.getId();
			if (A == id) {
				flag = true;
				System.out.println(a);
				break;
			}
		}

		if (!flag) {
			System.out.println("Failed : Invalide Id");
		}
	}

	public void showAllEmp() {
		System.out.println("Employees Present: " + comp.getEmployeeslist().size() + "\n");
		System.out.println(comp.getEmployeeslist());
	}

}


