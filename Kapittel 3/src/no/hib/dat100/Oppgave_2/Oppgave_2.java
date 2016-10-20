package no.hib.dat100.Oppgave_2;

import easyIO.*;

public class Oppgave_2 {
	public static void main(String[] args) {
		Out skjerm = new Out();
		int BREDDE1 = 12;
		String linje = "------------------------------------";
		
		skjerm.out("Bilmerke", BREDDE1, Out.LEFT);
		skjerm.out("Årsmoddel", BREDDE1, Out.CENTER);
		skjerm.outln("Reg.nr.", BREDDE1, Out.RIGHT);
		skjerm.outln(linje);
		
		skjerm.out("Mercedes", BREDDE1, Out.LEFT);
		skjerm.out("1999", BREDDE1, Out.CENTER);
		skjerm.outln("UE65660", BREDDE1, Out.RIGHT);
		
		skjerm.out("Ford", BREDDE1, Out.LEFT);
		skjerm.out("2003", BREDDE1, Out.CENTER);
		skjerm.outln("ZE95523", BREDDE1, Out.RIGHT);
		
		skjerm.out("Toyota", BREDDE1,Out.LEFT);
		skjerm.out("2006", BREDDE1, Out.CENTER);
		skjerm.outln("DK53401", BREDDE1, Out.RIGHT);
		
		skjerm.out(linje);
				
	}

}
