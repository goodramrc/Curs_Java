package temacurs3;

import java.util.Scanner;

public class ExamScore {
	
	int score;
	
	public void askForScore () {
		 
			System.out.println("Introduceti punctajul testului: ");
			Scanner scan = new Scanner(System.in);
			score = scan.nextInt();
			scan.close();
		}
	
	public void checkTheScore() {
		if (score >=0 && score <=65) {
			System.out.println("Ai picat, Mai incearca");
		} else if (score >= 66) {
			System.out.println("Ai trecut.");
		} else {
			System.out.println("Introdu o valoare mai mare sau egala cu 0.");
		}
		
	}
}
