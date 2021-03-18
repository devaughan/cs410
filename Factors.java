import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		int upperLimit = 0; // stores the user inputted max
		int product; // stores the product
		int left; // first multiple
		int right; // second mutliple
		//int[][] answer = {};
		
		
		while (upperLimit < 4) {
			System.out.print("Enter an upper limit (4 or more): ");
			upperLimit = input.nextInt();
		}
		
		for (product = 4; product <= upperLimit; product++) {
			
			for (left = 2; left < upperLimit / 2; left++) {
				for (right = 2; right <= Math.sqrt(product); right++) {
					if (left * right == product) {
						//answer.add({left, right});
						System.out.println(product + " = " + left + " x " + right);
					}
				}
			}
		}
		
	}
}