package no.hvl.dat100ptc.oppgave3;

import static java.lang.Math.*;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSUtils {

	public static double findMax(double[] da) {

		double max = da[0]; 
		
		for (double d : da) {
			if (d > max) {
				max = d;
			}
		}
		
		return max;
	}

	public static double findMin(double[] da) {

		double min = da[0];
		
		for (double d : da) {
			if (d < min) {
				min = d;
			}
		}
		
		return min;


	}

	public static double[] getLatitudes(GPSPoint[] gpspoints) {
	
		double LATtab [] = new double [gpspoints.length];
		int i = 0;	
		
		for (GPSPoint l : gpspoints) {
			LATtab[i] = l.getLatitude();
			i++;
		}
		
		return LATtab;
				
	}

	public static double[] getLongitudes(GPSPoint[] gpspoints) {

		
		double LONGtab [] = new double [gpspoints.length];
		int i = 0;	
		
		for (GPSPoint l : gpspoints) {
			LONGtab[i] = l.getLongitude();
			i++;
		}
		
		return LONGtab;

	}

	private static int R = 6371000; // jordens radius

	public static double distance(GPSPoint gpspoint1, GPSPoint gpspoint2) {

        double d;
        double latitude1, longitude1, latitude2, longitude2;

        // TODO - START
        latitude1 = gpspoint1.getLatitude();
        latitude2 = gpspoint2.getLatitude();
        longitude1 = gpspoint1.getLongitude();
        longitude2 = gpspoint2.getLongitude();
        
        double deltaLat = toRadians(latitude2 - latitude1);
        double deltaLong = toRadians(longitude2 - longitude1);
        
        double a = pow(sin(deltaLat/2.0),2) + cos(toRadians(latitude1)) * cos(toRadians(latitude2)) 
                * pow(sin(deltaLong/2.0),2);
        
        double c = 2.0 * atan2(sqrt(a), sqrt(1-a));
        d = R * c;
        return d;
        
    }

	public static double speed(GPSPoint gpspoint1, GPSPoint gpspoint2) {

		int time = gpspoint2.getTime() - gpspoint1.getTime();		
		double meter = (distance(gpspoint1, gpspoint2));
		
		double speed = (meter/time)*3.6;
		
		return speed;
		

	}

	public static String formatTime(int secs) {

		String timestr;
		String TIMESEP = ":";
		String timstr;
		String minstr;
		String sekstr;
		
		int tim = (secs/3600);
        int min = (secs%3600/60);
        int sek = (secs%3600%60);
		
        if (tim < 10) {
        	timstr = "0" + tim;
        }
        else {
        	timstr = "" + tim;
        }
        
        if (min < 10) {
        	minstr = "0" + min;
        }
        else {
        	minstr = "" + min;
        }
        
        if (sek < 10) {
        	sekstr = "0" + sek;
        }
        else {
        	sekstr = "" + sek;
        }
        
		timestr = "  " + timstr + TIMESEP + minstr + TIMESEP + sekstr;
		
		return timestr;
		
		

	}
	private static int TEXTWIDTH = 10;

	public static String formatDouble(double d) {

		String str = "";
		
		
		double f = round(d*100)/100.0;
		
		String fstr = f + "";
		
		int p = TEXTWIDTH - fstr.length();
		for (int i=0; i < p; i++) {
			str += " ";
		}
		str += fstr;
		
		
		return str;
		
	}
}
