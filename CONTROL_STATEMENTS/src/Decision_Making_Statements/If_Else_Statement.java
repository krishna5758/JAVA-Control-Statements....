package Decision_Making_Statements;

import java.util.Scanner;

public class If_Else_Statement {

	public static void main(String[] args) {
		
		int input;
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the number : ");
		input = sc.nextInt();
		
		if (input >= 5) {
			
			System.out.println("The given number is greater than or equal tofive");
		}else {
			System.out.println("wrong Entry! please try again");
		}
		
	}
}
