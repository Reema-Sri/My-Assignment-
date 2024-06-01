package Week1.Day1;


public class IsPrime {

	public static void main(String[] args) {
		
		int  j=7;
		boolean IsPrime = true;
		
		for (int i = 2; i < j; i++) {
			if(j%i==0) {
			IsPrime = false;
			System.out.println("Non-Prime");
			break;
			}
			
		}
			if(IsPrime==true) {
				System.out.println("Prime");
				
				}
			
		}

	}
