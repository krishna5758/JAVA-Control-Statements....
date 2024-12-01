package Jump_Statement;

           // Exits the loop or switch entirely.

public class Break_Statement {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {   // Loop from 1 to 10
			
			if (i == 5) {                // Condition to break
				
				System.out.println("Breaking the loop at i = "+i);
				break;                 // Exits the loop
			}
			
			System.out.println("i: " +i);
		}
	}
}
