package curs1;

/*
 * multi line comment
 */

//UpperCamelCase         //metoda_mea_care_face_lucruri(snake_case)
//lowerCamelCase         //metodaMeaCareFaceLucruri

public class Tester {     
	//variabile
	private String nume;
	public int ratePerHour;
	
	
	//getter
	public String getNume() {
		return nume;
	}
	//setter
	public void setNume(String nume) {
		this.nume = nume;

	}
	
	//constructor
//		public Tester() {}
	
	public Tester (String nume, int rate) {
		setNume(nume);
		ratePerHour = rate;
	}
	
}


