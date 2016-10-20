package no.hib.dat100.Oppgave_1;

import java.util.Scanner;

public class Meny {
	public static void meny() {
		Array a = new Array();
		
		String linje = "-----------------------";
		String meny = 	linje 
						+ "\n1- Skriv ut array\n" 
						+ "2 - Regn sum av array\n" 
						+ "3 - Avslutt\n" 
						+ linje 
						+ "\nvalg: ";

		Scanner tast = new Scanner(System.in);
		int valg = 0;
		do {
			System.out.print(meny);
			valg = tast.nextInt();

			switch (valg) {
			case 1:
				System.out.println();
				a.skrivArray();
				System.out.println();
				break;
			case 2:
				a.regnArray();
				a.resArray();
				System.out.println();
				break;
			case 3:
				break;
			default:
				System.out.println("\nUkjent menyvalg\n");
			}
		} while (valg != 3); // do-while
		tast.close();
	}
}
