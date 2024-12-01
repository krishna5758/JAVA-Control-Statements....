package Jump_Statement;

        // Exits the current method and optionally returns a value

public class Return_Statement {

	public static void main(String[] args) {
		
		System.out.println("Before Return Statement");
		
		if (true) {
			
			return ;  // exit the method
		}
		
		System.out.println("these line will not execute"); // unreachable.
	}
}
