package Decision_Making_Statements;

import java.util.Scanner;

public class Switch_Statement {

	public static void main(String[] args) {
		
		int day;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the day: ");
		day = sc.nextInt();
		
		switch (day) {
		
		        case 1:
		        	System.out.println(" its Momday!");
		        	break;
		        	
		        case 2:
		        	System.out.println(" its Tuesdy!");
		        	break;
		        	
		        case 3:
		        	System.out.println("its Wednesday!");
		        	break;
		        	
		        case 4:
		        	System.out.println("its Thursday!");
		        	break;
		        	
		        case 5:
		        	System.out.println("its friday!");
		        	break;
		        	
		        default:
		        	System.out.println("its Weekend!");
		}
	}
}
