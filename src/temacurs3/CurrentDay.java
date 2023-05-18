package temacurs3;

import java.util.Scanner;

public class CurrentDay {
	
	int numar;
		
	public void askForANumber() {
		System.out.println("Ce zi este astazi ? ");
		Scanner scan = new Scanner(System.in);
		numar = scan.nextInt();
		scan.close();
	}
	
	public void showWeekDayName() {
		String[] weekDays = {"Luni", "Marti", "Miercuri", "Joi", "Vineri", "Sambata", "Duminica"};
		
		
		if (numar >=1 && numar <=7) {
			System.out.println("Astazi este: " + weekDays[numar -1]);
		} else if(numar >7) {
			System.out.println("Saptamana are doar 7 zile, te rog sa introduci un numar valid");
		} else {
			System.out.println("Te rog sa introduci un numar mai mare ca 0 ");
		}
	}
	

}
