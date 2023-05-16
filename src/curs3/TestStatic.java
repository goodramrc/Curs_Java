package curs3;

public class TestStatic {

	public static void main(String[] args) {
		
		StaticVsNonStatic obj = new StaticVsNonStatic();
		obj.prenume = "Ceva";
		obj.printNormal();
		
		StaticVsNonStatic.nume = "Altceva";
		StaticVsNonStatic.printStatic();
	

	}

}
