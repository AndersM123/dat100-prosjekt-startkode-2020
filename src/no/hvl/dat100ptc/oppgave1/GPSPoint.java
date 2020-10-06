package no.hvl.dat100ptc.oppgave1;

import no.hvl.dat100ptc.TODO;

public class GPSPoint {

	private int time;
	private double latitude;
	private double longitude;
	private double elevation;
	
	//Heisann
		
	public GPSPoint(int time, double latitude, double longitude, double elevation) {

		this.time = time;
		this.latitude = latitude;
		this.longitude = longitude;
		this.elevation =elevation;

	}

	// TODO - get/set metoder
	public int getTime() {
		
		return time;
		
		
	}

	public void setTime(int time) {
				
		this.time=time;

	}

	public double getLatitude() {
		
		return latitude;
	}

	public void setLatitude(double latitude) {
		
		
		
	}

	public double getLongitude() {
		
		
		
	}

	public void setLongitude(double longitude) {
		
		
		
	}

	public double getElevation() {
		
		
		
	}

	public void setElevation(double elevation) {
		
		
		
	}
	
	public String toString() {
		
		String str;
		
		// TODO - start

		throw new UnsupportedOperationException(TODO.method());

		// TODO - slutt
		
	}
}
