package temacurs4;

import java.util.Scanner;

public class SumaNumerelor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int suma=0;
		
		for(int i = 1; i<=10; i++) {
			System.out.println("Please enter number " + i + ": ");
			int numar = scanner.nextInt();
			suma += numar;
		}
		
		System.out.println("The sum of the number is: " + suma);

	}

}
