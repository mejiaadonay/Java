/**
*
*      (Area and perimeter of a circle) Write a program that displays the area and 
*		perimeter of a circle that has a radius of 5.5 using the following formula:
*		
*		perimeter = 2 X radius X PI
*		area = radius X radius X PI
*
*	@author: Jose Escobar Mejia
*	@date: March 13, 2016
*/

 public class Exercise_08 {
 	public static void main(String[] args) {

 		double pi = 3.14159265;
 		double radius = 5.5;

 		double perimeter = 2 * radius * pi;
 		double area = radius * radius * pi;
		
		System.out.println("Perimeter of a circle of radius 5.5 is: " + perimeter);
        System.out.println("And the area: " + area);
 	}
 }
 
