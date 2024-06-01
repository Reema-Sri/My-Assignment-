package Week1.Day2;

import java.util.Arrays;

public class Missingelement {

	public static void main(String[] args) {
		int Input[] = {1, 4,3,2,8, 6, 7}; 
	      Arrays.sort(Input);
		//Output -> 5 
		
		for (int i = 1; i <= Input.length-1; i++) {
	     int	B = i+1;
				if(i+1 != Input[i]) {
					System.out.println(B);
					break;
				
				}
				
			}
			
		}
		
	}

