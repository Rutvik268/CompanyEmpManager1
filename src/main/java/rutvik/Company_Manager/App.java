package rutvik.Company_Manager;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Console_Curd curd = new Console_Curd();

		while (true) {
			System.out.println("\n**********WELCOME**********");
			System.out.println(".1 ADD EMPLOYEE ");
			System.out.println(".2 DELETE EMPLOYEE");
			System.out.println(".3 SHOW EMPLOYEES");
			System.out.println(".4 SHOW ALL EMPLOYEES");
			System.out.println(".5 EXIT");

			int option = sc.nextInt();

			if (option == 5) {
				System.out.println("Exit");
				break;
			}
			;
			switch (option) {

			case 1: {
				curd.addEmp();
				break;
			}
			case 2: {
				curd.delEmp();
				break;
			}
			case 3: {
				curd.showEmp();
				break;
			}
			case 4: {
				curd.showAllEmp();
				break;
			}
			default:
				System.out.println("Invalid Option Selcted");
			}
		}
	}
}
