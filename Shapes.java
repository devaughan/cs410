import java.util.Scanner;

public class Shapes {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		int userInput;
		
		System.out.println("Welcome to shapes");
		System.out.println("You can perform the following calculations\n");
		System.out.println("[1]\t Calculate the hypotenuse of a right triangle");
		System.out.println("[2]\t Calculate the area of a right triangle");
		System.out.println("[3]\t Calculate the perimeter of a right triangle");
		System.out.println("[4]\t Calculate the area of a rectangle");
		System.out.println("[5]\t Calculate the perimeter of a rectangle");
		System.out.println("[6]\t Calculate the length of diaonal of a rectangle");
		System.out.println("[7]\t Calculate the area of a square");
		System.out.println("[8]\t Calculate the perimter of a square");
		System.out.println("[9]\t Calculate the length of diagonal of a square");
		System.out.print("\nInput the calculation you would like to perform: ");
		userInput = input.nextInt();
		
		double lengthOne;
		double lengthTwo;
		double finalCalculation;
		
		if(userInput == 1) // hypotenuse of a right Triangle
		{
			System.out.print("Enter the length of side one: ");
			lengthOne = input.nextDouble();
		
			System.out.print("Enter the length of side two: ");
			lengthTwo = input.nextDouble();
		
			finalCalculation = hypotenuse(lengthOne, lengthTwo);
		
			System.out.printf("The hypotenuse is length %.3f",finalCalculation);			
		}
		else if (userInput == 2) // area of a right triangle
		{
			System.out.print("Enter the length of side one: ");
			lengthOne = input.nextDouble();
		
			System.out.print("Enter the length of side two: ");
			lengthTwo = input.nextDouble();
			
			finalCalculation = areaRightTriangle(lengthOne, lengthTwo);
			
			System.out.printf("The area is %.3f",finalCalculation);
		}
		else if (userInput == 3) // perimter of a right triangle
		{
			System.out.print("Enter the length of side one: ");
			lengthOne = input.nextDouble();
		
			System.out.print("Enter the length of side two: ");
			lengthTwo = input.nextDouble();
			
			finalCalculation = perimeterTriangle(lengthOne, lengthTwo);
			
			System.out.printf("The perimter is length %.3f",finalCalculation);
		}
		else if (userInput == 4) // area of a rectangle
		{
			System.out.print("Enter the length of side one: ");
			lengthOne = input.nextDouble();
		
			System.out.print("Enter the length of side two: ");
			lengthTwo = input.nextDouble();
			
			finalCalculation = areaRectangle(lengthOne, lengthTwo);
			
			System.out.printf("The area is %.3f",finalCalculation);
		}
		else if (userInput == 5) // perimter of a rectangle
		{
			System.out.print("Enter the length of side one: ");
			lengthOne = input.nextDouble();
		
			System.out.print("Enter the length of side two: ");
			lengthTwo = input.nextDouble();
			
			finalCalculation = perimeterRectangle(lengthOne, lengthTwo);
			
			System.out.printf("The perimter is %.3f",finalCalculation);
		}
		else if (userInput == 6) // diagonal of a rectangle
		{
			System.out.print("Enter the length of side one: ");
			lengthOne = input.nextDouble();
		
			System.out.print("Enter the length of side two: ");
			lengthTwo = input.nextDouble();
			
			finalCalculation = hypotenuse(lengthOne, lengthTwo);
			
			System.out.printf("The diagonal is length %.3f",finalCalculation);
		}
		else if (userInput == 7) // area of square
		{
			System.out.print("Enter the length of the square: ");
			lengthOne = input.nextDouble();
			
			finalCalculation = areaRectangle(lengthOne, lengthOne);
			
			System.out.printf("The area is %.3f",finalCalculation);
		}
		else if (userInput == 8) // perimter of square
		{
			System.out.print("Enter the length of the square: ");
			lengthOne = input.nextDouble();
			
			finalCalculation = perimeterRectangle(lengthOne, lengthOne);

			System.out.printf("The perimter is %.3f",finalCalculation);
		}
		else // Diagonal of square
		{
			System.out.print("Enter the length of the square: ");
			lengthOne = input.nextDouble();
			
			finalCalculation = hypotenuse(lengthOne, lengthOne);
			
			System.out.printf("The diagonal is length %.3f",finalCalculation);
			
		}
	}
	
	public static double hypotenuse(double sideOne, double sideTwo)
	{
		double sideThree;
		
		sideThree = Math.sqrt(Math.pow(sideOne, 2) + Math.pow(sideTwo, 2));
		
		
		return sideThree;
	}
	
	public static double areaRightTriangle(double sideOne, double sideTwo)
	{
		double area;
		
		area = sideOne * sideTwo * 0.5;
		
		
		
		return area;
	}
	
	public static double perimeterTriangle(double sideOne, double sideTwo)
	{
		double perimeter;
		double sideThree;
		
		sideThree = hypotenuse(sideOne, sideTwo);
		perimeter = sideOne + sideTwo + sideThree;
		
		return perimeter;
	}
	
	public static double areaRectangle(double length, double width)
	{
		double area;
		
		area = length * width;
		
		return area;
	}
	
	public static double perimeterRectangle(double length, double width)
	{
		double perimeter;
		
		perimeter = 2 * (length + width);
		
		return perimeter;
	}
	
}