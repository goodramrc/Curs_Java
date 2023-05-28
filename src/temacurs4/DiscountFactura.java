package temacurs4;

import java.util.Scanner;

public class DiscountFactura {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti valoarea facturii: ");
		
		int factura = scanner.nextInt();
		
		int facturaFinala;
		int discount;
		
		
		
		discount = factura>100? factura*10/ factura: factura<100?factura*5/ factura:0 ;
		facturaFinala = factura - discount;
		
		System.out.println("Discountul este:" + discount);
		System.out.println("Valoarea facturii finale este: " + facturaFinala);
	}

}
