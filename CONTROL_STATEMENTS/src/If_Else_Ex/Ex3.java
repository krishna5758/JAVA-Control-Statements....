package If_Else_Ex;

import java.util.Scanner;

// Q> check if the number is positive , negative or zero.

public class Ex3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int input = sc.nextInt();
		
		if (input > 0) {
			System.out.println(input + " is positive number!");
		
		}else if (input == 0) {
			System.out.println(input + " is zero number!");
			
		}else {
			System.out.println(input + " is a negative number!");
		}
		
		sc.close();
		
	}

}
