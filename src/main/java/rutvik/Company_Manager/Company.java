package rutvik.Company_Manager;

import java.util.ArrayList;

public class Company {
	private String name;
	private ArrayList<Employee> employeeslist;
	
	static Company obj = new Company("Ainosoft");
	
	private Company (String name) {
		this.name = name;
		this.employeeslist = new ArrayList<>();
	}
	
	
	public static Company getInstance() {
		return obj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Employee> getEmployeeslist() {
		return employeeslist;
	}

	public void setEmployeeslist(ArrayList<Employee> employeeslist) {
		this.employeeslist = employeeslist;
	}
	
	
}
