package Decision_Making_Statements;

import java.util.Scanner;

public class If_Else_If_Ladder {

	public static void main(String[] args) {
		
		int marks;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks : ");
		marks = sc.nextInt();
		
		if (marks >= 90) {
			
			System.out.println("Student is passed with A+ grade!  "); 
			
		}else if (marks >= 80) {
			
			System.out.println("Student is passed with B grade!");
		
		}else if (marks <= 70 && marks >= 45) {
			
			System.out.println("Student is passed with C grade!");
		
		}else {
			
			System.out.println("Student is failed!");
		}
		
	}

}
