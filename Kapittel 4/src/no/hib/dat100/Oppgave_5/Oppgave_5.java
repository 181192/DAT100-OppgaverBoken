package no.hib.dat100.Oppgave_5;

public class Oppgave_5 {

	public static void main(String[] args) {
		final double pi = Math.PI;
		int r=1;
		double omkrets = 2*pi*r;
		while (omkrets < 1000) {
			System.out.printf(" %s %3d %s %6.2f %n" , "Radius = ", r ," gir omkrets = ", omkrets);
			r++;
			omkrets = 2*pi*r;
		}
		

	}

}
