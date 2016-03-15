/**
*
*      (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. 
*	    Write a program that displays the average speed in miles per hour.
*	   (Nete that 1 mile is 1.6 kilometers)
*
*	@author: Jose Escobar Mejia
*	@date: March 14, 2016
*/

 public class Exercise_11 {
 	public static void main(String[] args) {

 		final double kilometer = 14.0;
 		double distranceInMiles = kilometer / 1.6; // Conver kilometers in miles

 		final double timeInMinutesAndSeconds = ((45 * 60.0 + 30.0) / (60 * 60)); // Time conversion

 		double averageSpeed = distranceInMiles / timeInMinutesAndSeconds;
		
		System.out.printf("The average speed is: %.4f %s\n", averageSpeed, " miles per hour.");
 	}
 }
 
