import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		int upperLimit = 0;
		
		
		while (upperLimit < 4) {
			System.out.print("Enter an upper limit (4 or more): ");
			upperLimit = input.nextInt();
		}
		
		
		
		for (int product = 0; product <= upperLimit; product++) {
			for (int c = 2; c <= upperLimit / 2; c++) {
				for (int x = 2; x <= upperLimit / 2; x++) {
					if (c * x == product)
						System.out.println(product + " = " + c + " x " + x);
				}
			}				
		}
	}
}