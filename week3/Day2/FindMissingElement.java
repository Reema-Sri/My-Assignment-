package week3.Day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		              int[] a =  {1, 2, 3, 4, 10, 6, 8};
		              
		             Arrays.sort(a);
		            
		     	   
		             for (int i = 1; i < a.length -1; i++) {
		              if (a[i + 1] - a[i] > 1) {
		     	             
		  	              for (int j = a[i] + 1; j < a[i + 1]; j++) {
		  	                  System.out.print(j + " ");
		  	                }

					}
		             }
	}
}
