package temacurs4;

import java.util.Scanner;

public class TablaInmultirii {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		
		System.out.println("Please enter a number: ");
		int number = scanner.nextInt();
		
		for(int i=1; i<=10; ++i) {
			
			System.out.println(number + "x" + i + "=" + (number * i));
		}
	}

}
