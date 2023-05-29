package temacurs5;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String user = "TestUser";
		
		int password = 1234;
		
		int maxAttempts = 3;
		
		int attemptsCount = 0; 
		
		do {
			
			System.out.println("Please enter your username: ");
			
			String filledUser = scanner.nextLine();
			
			System.out.println("Please eenter your password: ");
			
			int filledPassword = scanner.nextInt();
			scanner.nextLine();
			
			if (filledUser.equals(user) && filledPassword == password) {
				System.out.println("Login Succesfull");
				break;
			} else {
				System.out.println("Login Error");
			
				attemptsCount++;
			}
			
		} while (attemptsCount < maxAttempts); 
		
		if (attemptsCount == maxAttempts) {
			System.out.println("Maximum attempts reached. User blocked");
		}
		
		
		scanner.close();
	}

}
