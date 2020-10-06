package no.hvl.dat100ptc;

public class TODO {

	public static String method() {
		
		String toString = Thread.currentThread().getStackTrace()[2].getMethodName();
		
		return "toString" + toString + " er ikke implementert";
	}
	
	
	public static String construtor(String GPSpoint) {
				
	   return "Konstruktøren for klassen" + GPSpoint + " er ikke implementert";
		
	}

}
