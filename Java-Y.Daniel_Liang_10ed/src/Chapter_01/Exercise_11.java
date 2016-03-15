/**
*      (Population projection) The U.S Census Bureau projects population based on the following assumptions:
*
*	    one birth every 7 seconds
*		One death every 13 seconds
*		One new immigrant every 45 seconds
*		
*		Write a program to display the population for each of the next five years. Assume the 
*		current population is 312,032,486 and one year has 365 days. Hints: In Java, if two
*		integers perform division, the result is an integer. The fractional part is truncated. For
*		example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with
*		the fractional part, one of the values involved in the division must be a number with a
*		decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
*
*	@author: Jose Escobar Mejia
*	@date: March 15, 2016
*/

 public class Exercise_11 {
 	public static void main(String[] args) {

 		double currentPopulation = 312032486;
 		double birthRate = 7.0, deathRate = 13.0, inmigrantionRate = 45.0;
        double secondsPerYear = (60 * 60 * 24 * 365);

        double birthGrowth = (secondsPerYear / birthRate);
        double deathGrowth = (secondsPerYear / deathRate);
        double inmigrantionGrowth = (secondsPerYear / inmigrantionRate);
        double growthPerYear = birthGrowth + inmigrantionGrowth - deathGrowth; 

        System.out.println("The current population is " + (int)currentPopulation);
        System.out.println("The population growth per year is " + (int)currentPopulation);
 
        for (int i = 1; i <= 5; i++) {
            currentPopulation += growthPerYear;
            System.out.println("The Population in year " + i + " = " + (int)currentPopulation);
        }

	}
	
}
 
