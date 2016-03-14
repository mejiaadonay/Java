/*
*	(Approximate PI) PI can be computed using the following formula:
*	 PI = 4 X ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... )
*
*	Write a program that displays the result of 4 X ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)
*	and 4 X ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13). Use 1.0 instead of 1 in your program.
*                            
*		@author: Jose Escobar Mejia
*		@date: March 13, 2016
*/
public class Exercise_07 {
	public static void main(String[] args) {
		// Proximation of PI 
		double pi = 4.0 * ( 1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)); 
		// Result is: 2.9760461760461765
		System.out.println( "The approximation of PI is: " + pi);
	}
}