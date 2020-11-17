/**
 * 
 */
package edu.gsu.csc1301.geometry;
import java.util.Scanner;
/**
 * This program calculates the area of a geometric 
 * shape, either circle, rectangle, or triangle.
 * 
 * @author Patrick Copeland
 * @version 03/29/2020
 */
public class Geometry 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		displayMenu();
		System.out.print("Enter your choice (1-3): ");
		// User select desired calculation
		int choice = in.nextInt();
		while (choice < 1 || choice > 3)
		{
			//Validates user input
			System.out.print("Invalid choice. Please enter 1 - 3: ");
			choice = in.nextInt();
		}
		selectOption(choice);
		// Print farewell
		System.out.println("\nThanks for using the Geometry Calculator - Goodbye!");
		
	}
	
	/**
	 * This method displays the geometry calculator application menu
	 * @param string contents
	 * @return 
	 */
	public static void displayMenu()
	{
		// Display menu data
		String calculate = "Calculate the Area of a ";
		System.out.println("Welcome to the Geometry Calculator Application\n");
		System.out.println("1. " + calculate + "Circle");
		System.out.println("2. " + calculate + "Rectangle");
		System.out.println("3. " + calculate + "Triangle");
	}
	
	/**
	 * This method calculates the area of a circle 
	 * @param 
	 * @return circle's area
	 */
	public static double circle()
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("What is the circle's radius? ");
		double radius = in.nextDouble();
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	/**
	 * This method calculates the area of a rectangle 
	 * @param 
	 * @return rectangle's area
	 */
	public static double rectangle()
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("What is the rectangle's length? ");
		double length = in.nextDouble();
		System.out.print("What is the rectangle's width? ");
		double width = in.nextDouble();
		double area = length * width;
		return area;
	}
	
	/**
	 * This method calculates the area of a triangle 
	 * @param 
	 * @return triangle's area
	 */
	public static double triangle()
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("What is the length of the triangle's base? ");
		double base = in.nextDouble();
		System.out.print("What is the triangle's height? ");
		double height = in.nextDouble();
		double area = (base * height) / 2;
		return area;
	}
	
	/**
	 * This method prints the area of the selected shape to two decimal places 
	 * @param area The area of a given shape
	 * @return
	 */
	public static void printArea(double area)
	{
		System.out.printf("The area is %.2f%n", area);
	}
	
	/**
	 * This methods prompts the user to choose a shape and print measurement inquiries 
	 * @param choice The shape for which the user wants to find the area
	 * @return triangle's area
	 */
	public static void selectOption(int choice)
	{
		if (choice == 1)
		{
			double circleArea = circle(); 
			printArea(circleArea);
		}
		else if (choice == 2)
		{
			double rectangleArea = rectangle();
			printArea(rectangleArea);
		}
		else if (choice == 3)
		{
			double triangleArea = triangle();
			printArea(triangleArea);
		}
	}
}
