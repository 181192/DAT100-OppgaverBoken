package no.hib.dat100.Oppgave_1;

import easyIO.Out;

	public class Oppgave_1 {

		public static void main(String[] args) {
			// TODO Auto-generated method s
			final int BREDDE1 = 15;
			
			Out skjerm = new Out ();
			
			skjerm.outln("a", BREDDE1, Out.CENTER);
			skjerm.outln("a a", BREDDE1, Out.CENTER);
			skjerm.outln("a b a", BREDDE1, Out.CENTER);
			skjerm.outln("a c c a", BREDDE1, Out.CENTER);
			skjerm.outln("a d f d a", BREDDE1, Out.CENTER);
			
			skjerm.close();
			}

	}



