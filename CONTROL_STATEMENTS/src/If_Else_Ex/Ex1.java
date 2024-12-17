package If_Else_Ex;

import java.util.Scanner;

// Q> Check if a number is even or odd.

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int input = sc.nextInt();
		
		if (input % 2 == 0 ) {
			System.out.println(input +"is even number!");
			
		}else {
			System.out.println(input+ " is odd number! ");
		}
		
		sc.close();
	}
}
