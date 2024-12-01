package Looping_Statements;

 // Similar to while, but guarantees at least one execution since the condition is 
// checked after the loop body.



public class Do_While_Loop {

	public static void main(String[] args) {
		
		int count = 1;
		
		do {
			
			System.out.println("Count : "+count);
			count++;
		}while (count <= 5);
		
	}
}
