package temacurs4;


public class CalculComision {

	public static void main(String[] args) {
		
		
		double comision;
		int vanzari = 3500;
		
		if (vanzari>2500) {
			comision = (5.0 / 100.0) * vanzari;
		} else {
			comision = 0.0;
		} 
		
		System.out.println("Comisionul tau este :" + comision);
		

	}

}
