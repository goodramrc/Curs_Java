package temacurs5;

public class Fibonacci {
	
	 public static void main(String[] args) {
	        int numereDorite = 9;

	        int primulNumar = 0;
	        int alDoileaNumar = 1;
	        
	        
	        System.out.println("Rezultate cu metoda for: ");
	        System.out.print("Seria Fibonacci pentru " + numereDorite + " numere este: " + primulNumar + ", " + alDoileaNumar);

	        for (int i = 2; i < numereDorite; i++) {
	            int urmatorulNumar = primulNumar + alDoileaNumar;
	            System.out.print(", " + urmatorulNumar);

	            primulNumar = alDoileaNumar;
	            alDoileaNumar = urmatorulNumar;
	        }

	        System.out.println("\n" + "\n" + "-------------------" + "\n");
	        System.out.println("Rezultate cu metoda while: ");

	        // Resetez valarile primite in medota cu for
	        primulNumar = 0;
	        alDoileaNumar = 1;
	        int i = 2;

	        System.out.print("Seria Fibonacci pentru " + numereDorite + " numere este: " + primulNumar + ", " + alDoileaNumar);

	        while (i < numereDorite) {
	            int urmatorulNumar = primulNumar + alDoileaNumar;
	            System.out.print(", " + urmatorulNumar);

	            primulNumar = alDoileaNumar;
	            alDoileaNumar = urmatorulNumar;

	            i++;
	        }
	    }
	
	
}
