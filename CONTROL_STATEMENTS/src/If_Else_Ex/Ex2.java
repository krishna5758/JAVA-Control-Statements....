package If_Else_Ex;

import java.util.Scanner;

//Q> find the largest number of two numbers. 

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the first number: ");
		int input1 = sc.nextInt();
		
		System.out.print("Enter the Second number: ");
		int input2 = sc.nextInt();
		
		if (input1 > input2) {
			System.out.println(input1+ " is greater than " +input2+ " number!");
			
		}else if (input2 > input1) {
			System.out.println(input2+ "is greater than first number!");
		}else {
			System.out.println("Both are same numbers!");
		}
		
		sc.close();
	}
}
