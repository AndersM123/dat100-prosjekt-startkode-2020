package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100.varelager.Vare;
import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSData {

	private GPSPoint[] gpspoints;
	protected int antall = 0;

	public GPSData(int n) {

		this.gpspoints = new GPSPoint[n];
		
	}

	public GPSPoint[] getGPSPoints() {
		return this.gpspoints;
	}
	
	protected boolean insertGPS(GPSPoint gpspoint) {

		boolean inserted = false;
		if (antall < gpspoints.length) {
			gpspoints[antall] = gpspoint;
			antall++;
			inserted = true;
		}
		else {
			System.out.println("Ikke nok plass!");
		}
		return inserted;	
	}

	public boolean insert(int time, double latitude, double longitude, double elevation) {
		
		GPSPoint gpspoint = new GPSPoint(time, latitude, longitude, elevation);
		
		return insertGPS(gpspoint);	
	}

	public void print() {

		System.out.println("====== Konvertert GPS Data - START ======");

		// TODO - START

		throw new UnsupportedOperationException(TODO.method());

		// TODO - SLUTT
		
		// System.out.println("====== Konvertert GPS Data - SLUTT ======");

		
	}
}
