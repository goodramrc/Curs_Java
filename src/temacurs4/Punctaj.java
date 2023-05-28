package temacurs4;

import java.util.Scanner;

public class Punctaj {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti punctajul: ");
		
		int punctaj = scanner.nextInt();
		
		String calificativ = punctaj >=90 ? "FB" : punctaj>=80 ? "B" : "S";
		
		if (calificativ.equals("FB")) {
			System.out.println("Ai primit Foarte Bine");
			
		}else if (calificativ.equals("B")) {
			System.out.println("Ai primit Bine");
			
		}else {
			System.out.println("Ai primit: Sufient");
		}

	}

}
