package Jump_Statement;

     // Skips the current iteration and moves to the next one.

public class Continue_Statement {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {      // Loop from 1 to 5
			
			if (i == 3) {                   // Condition to skip iteration
				
				System.out.println("Skipping the iteration " + i);
				continue;                  // Skips the rest of the loop body
			}
			
			System.out.println("i: "+i);
		}
	}
}
