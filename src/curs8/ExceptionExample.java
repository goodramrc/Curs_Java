package curs8;

public class ExceptionExample {

	public static void main(String[] args) {
		
		String [] week = {"L", "M", "Mi", "J", "V", "S", "D"};
		
		try {
		
			System.out.println("Inainte de eroare");
			System.out.println(week[9]);
			System.out.println("Dupa Eroare");
		
		}catch(ArrayIndexOutOfBoundsException obj) {
			obj.printStackTrace();
			System.out.println("Ai incercat sa accesezi un element in afara array-ului!");
	
		}
		
		for(String day : week) {
			System.out.print(day + " | ");
		}
		
	
		
		//NoSuchElementException - exceptie selenium cand nu gaseste un buton cautat
		//StaleElementException - daca se da un refresh la DOM, si elementul  when the element we are interacting with is destroyed and then recreated again
	}

}
