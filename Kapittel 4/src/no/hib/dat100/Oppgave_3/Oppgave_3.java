package no.hib.dat100.Oppgave_3;

import easyIO.*;

public class Oppgave_3 {

	public static void main(String[] args) {
		/*
		 Bydeler:
		 Alna (12)
		 Bjerke (9)
		 Frogner (5)
		 Gamle Oslo (1)
		 Grorud (10)
		 Grunderløkka (2)
		 Nordre Aker (8)
		 Nordstrand (14)
		 Sagene (3)
		 St. Hanshaugen (4)
		 Stovner (11)
		 Søndre Nordstrand (15)
		 Ullern (6)
		 Vestre Aker (7)
		 Østensjø (13)
		 
		 Utskriftformat Bydel 13 heter Østensjø
		 */
		
		In tastatur = new In();
		int valg;
		System.out.print("Skriv inn ett bydel nummer: ");
		valg = tastatur.inInt();
		
		switch (valg) {
			case 1 :
				System.out.println();
				System.out.println("Du skrev bydel nr. 1");
				System.out.println("Bydel 1 heter Gamle Oslo");
				break;
			case 2 :
				System.out.println();
				System.out.println("Du skrev bydel nr. 2");
				System.out.println("Bydel 2 heter Grunerløkka");
				break;
			case 3 :
				System.out.println();
				System.out.println("Du skrev bydel nr. 3");
				System.out.println("Bydel 3 heter Sagene");
				break;
			case 4 :
				System.out.println();
				System.out.println("Du skrev bydel nr. 4");
				System.out.println("Bydel 4 heter St. Hanshaugen");
				break;
			case 5 :
				System.out.println();
				System.out.println("Du skrev bydel nr. 5");
				System.out.println("Bydel 5 heter Frogner");
				break;
			case 6 :
				System.out.println();
				System.out.println("Du skrev bydel nr. 6");
				System.out.println("Bydel 6 heter Ullern");
				break;
			case 7 :
				System.out.println();
				System.out.println("Du skrev bydel nr. 7");
				System.out.println("Bydel 7 heter Vestre Aker");
				break;
			case 8 :
				System.out.println();
				System.out.println("Du skrev bydel nr. 8");
				System.out.println("Bydel 8 heter Nordre Aker");
				break;
			case 9 :
				System.out.println();
				System.out.println("Du skrev bydel nr. 9");
				System.out.println("Bydel 9 heter Bjerke");
				break;
			case 10 :
				System.out.println();
				System.out.println("Du skrev bydel nr. 10");
				System.out.println("Bydel 10 heter Grorud");
				break;
			case 11 :
				System.out.println();
				System.out.println("Du skrev bydel nr. 11");
				System.out.println("Bydel 11 heter Stovner");
				break;
			case 12 :
				System.out.println();
				System.out.println("Du skrev bydel nr. 12");
				System.out.println("Bydel 12 heter Alna");
				break;
			case 13 :
				System.out.println();
				System.out.println("Du skrev bydel nr. 13");
				System.out.println("Bydel 13 heter Østensjø");
				break;
			case 14 :
				System.out.println();
				System.out.println("Du skrev bydel nr. 14");
				System.out.println("Bydel 14 heter Nordstrand");
				break;
			case 15 :
				System.out.println();
				System.out.println("Du skrev bydel nr. 15");
				System.out.println("Bydel 15 heter Søndre Nordstrand"); 
				break;
		}			
	}
}

