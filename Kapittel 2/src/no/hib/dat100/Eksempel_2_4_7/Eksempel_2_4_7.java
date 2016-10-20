// BMI KALKULATOR

package no.hib.dat100.Eksempel_2_4_7;

import static javax.swing.JOptionPane.*;

public class Eksempel_2_4_7 {

public static void main (String[] args) {
	// Angi vekt i kg og høyde i meter
	double vekt = 48;
	double høyde = 1.54;
	
	// Regn ut body mass index
	double bodyMassIndex = vekt / (høyde * høyde);
	
	
	// Skriv ut resultatet på skjerm
	System.out.println("Vekt 		: " + vekt);
	System.out.println("Høyde 		: " + høyde);
	System.out.println("BMI  		: " + bodyMassIndex);
	//System.out.println("Overvektig 	: " + overvektig);
	
	// Skriv ut til eget vindu
	showMessageDialog(null, new Object[] 
		{
			("Vekt  		: " + vekt),
			("Høyde 		: " + høyde),
			("BMI 			: " + bodyMassIndex)
		});	
	
	// Overvekt skala:
	// Undervektig = < 18.5
	// Normal = fra 18.5 til 24.9
	// Overvektig = fra 25 til 30
	// Fedme = fra 30 til 34.9
	// Fedme, klasse II = fra 35 til 39.9
	// Fedme, klasse III = >40
	
		System.out.println("Vektklasse: ");
		if (bodyMassIndex < 18.5) {
			System.out.println("Undervektig");
			//showMessageDialog(null, Undervektig);
		}
		else if (bodyMassIndex < 24.9) {
			System.out.println("Normal");
			//showMessageDialog(null, Normal);
		}
		else if (bodyMassIndex < 25) {
			System.out.println("Overvektig");
		}
		else {
			System.out.println("Fedme");
		}
	}
}