package curs2;
import java.util.Scanner;
public class IfElseExample {

	public static void main(String[] args) {
		
		String username = "Test";
		int password = 1234;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu username :");
		String inputUsername = scan.next();
		System.out.println("Te rog introdu password :");
		int inputPassword = scan.nextInt();
		
		//Stringurile se verifica cu metoda equals nu cu ==
		// && inseamna "si"
		// || inseamna "ori"
		//true sau false - boolean
		if(username.equals(inputUsername) && password == inputPassword ) {
			System.out.println("login succesful");
			
		}
		
		else {
			System.out.println("username or password is wrong");
		}
	
		

	}

}
