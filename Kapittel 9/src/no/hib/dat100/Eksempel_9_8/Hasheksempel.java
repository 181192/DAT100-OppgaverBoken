package no.hib.dat100.Eksempel_9_8;

import java.util.HashMap;

import easyIO.In;

public class Hasheksempel {

	public static void main(String[] args) {
		
		In tastatur = new In();
		HashMap <String, Person> personregister = new HashMap <String, Person> ();
		
		System.out.print("Antall personer som registrers : ");
		int ant = tastatur.inInt();
		
		for (int i = 0; i < ant; i++) {
			System.out.println("Antall gjenværende personer " + (ant - i ));
			Person p = new Person(tastatur);
			personregister.put(p.telefonnr, p);
			
		}
		
		// Skriv ut alle personobjektene 
		System.out.println("Viser alle personer" + "(ukjent rekkeføkge) : ");
		for (Person p : personregister.values()) {
			p.skrivData();
		}
	}
}

class Person {
	String navn, adresse, telefonnr;
	
	Person(In tastatur) {
		System.out.print("Oppgi navn : ");
		navn = tastatur.inLine();
		System.out.print("Oppgi adresse : ");
		adresse = tastatur.inLine();
		System.out.print("Oppgi telefonnummer : ");
		telefonnr = tastatur.inLine();
	}
	
	void skrivData() {
		String linje = "----------------------------------------";
		System.out.println(linje);
		System.out.println("Navn\t\t : " + navn);
		System.out.println("Adresse\t\t : " + adresse);
		System.out.println("Telefonnummer\t : " + telefonnr);
		System.out.println(linje);
	}
}
