package Week1.Day2;

public class Palindrome {

	public static void main(String[] args) {
	
		int Input = 123321;
		int output = 0;
 		int rem;
	
		for (int i = Input; i > 0; i=i/10) {
			  rem = i%10;
			 output=(output*10)+rem;
		}		
			if(Input==output) {
				System.out.println("Palindrome");
			}
				else {
				 System.out.println("Not a Palindrome");
			}
			
		}
		
	}


