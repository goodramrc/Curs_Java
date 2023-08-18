package curs9;

public class VarargsExample {

	public static void main(String[] args) {
		
		printArguments("test", "test2");
		
		//JacvascriptExecutor
		//executeScript("", webelement1)
		//executeScript("", webelement1, webelement2 )
	}
	
	public static void printArguments(String str1, String str2) { 
		
		System.out.println(str1 + " " + str2);
	}

	public static void printVariableArguments(String...values) {
		
		for(String obj:values) {
			System.out.println(obj);
		}
	}
}
