package sqlProject;

import java.util.Scanner;

public class Main {

static void choicesFunction() {
		
		System.out.println("***************************");
		System.out.println("Welcome...Please Select one of the following options:");
		System.out.println("1. connect to database");
		System.out.println("2. insert to databse");
		System.out.println("3. Generate Report");
		System.out.println("4. Exit the system ");
	}
		
		

	public static void main(String[] args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		choicesFunction();
		
		do {

			int userInput = sc.nextInt();
			switch (userInput) {
			case 1:
				ConnectToDatabase connectToDatabse1 = new ConnectToDatabase(); 
				connectToDatabse1.conToData();
				choicesFunction();
//				
				break;
				
			case 2:
				InertToDatabase insToDatabse1 = new InertToDatabase(); 
				insToDatabse1.InsToDatabaseValue();
				choicesFunction();
				
				
				
				break;
				

			case 3:
				showReportFromTable ShowReport = new showReportFromTable(); 
				ShowReport.showTable();
				choicesFunction();
				break;

				

		
				
			case 4:
				System.out.println("Exiting The System Bye See you Again :)!....");
				System.exit(0);
				
				break;
			
			}

		} while (true);
	}
}
