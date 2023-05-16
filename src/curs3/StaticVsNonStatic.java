package curs3;

//import java.awt.print.Printable;

public class StaticVsNonStatic {
	// variabila statica (variabila de clasa)
	public static String nume;
	
	//variabila de instanta
	public String prenume;
	
	
	public static void printStatic() {
		System.out.println("Static");
	}
	
	public void printNormal() {
		System.out.println("Print normal");
	}
	
}

