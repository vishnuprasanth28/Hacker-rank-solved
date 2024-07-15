import java.util.Scanner;

public class Bonus {
	public static void main(String[]args) {
		// Intialiazing variables
		double salary;
		int yearOfService;
		double bonus;
		double netAmount;
		double originalSalary =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary");
		salary = sc.nextDouble();
		System.out.println("Enter how many years you work here");
		yearOfService = sc.nextInt();
		if (yearOfService>5 && yearOfService != 0 && salary>0) {
			
			originalSalary = salary;
			bonus = originalSalary*0.05;         // calculating bonus
			System.out.println("bonus :"+bonus);
			netAmount = salary + bonus;          // calculating netAmount = originalSalary + bonus
			System.out.println("Net  salary after adding bonus :"+netAmount);
			
			
			
		}
		else {
			System.out.println("better luck next time ");
		}
		sc.close();
	}

}
