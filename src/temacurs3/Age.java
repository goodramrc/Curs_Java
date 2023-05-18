package temacurs3;

import java.util.Scanner;

public class Age {
	
	int age;
	
	public void askForAge() {
		System.out.println("Introdu varsta ta : ");
		Scanner scan = new Scanner(System.in);
		age = scan.nextInt();
		scan.close();
	}
	
	public void checkForAge() {
		
		if (age <18) {
			System.out.println("Esti minor!");
		} else if (age >=18 && age <=65) {
			System.out.println("Esti adult.");
		} else {
			System.out.println("Esti batran.");
		}
	}

}
