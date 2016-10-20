package no.hib.dat100.Eksempel_2_4_7;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class Eksempel_2_4_7_prøving {

public static void main (String[] args) {
	// Skrive inn vekt i dialogvindu
	String vektTxt = showInputDialog("Oppgi vekt i kg: ");
	String høydeTxt = showInputDialog("Oppgi høyde i meter: ");
	
	// Angi vekt i kg og høyde i meter
	double vekt = parseDouble(vektTxt);
	double høyde = parseDouble(høydeTxt);
	
	// Regn ut body mass index
	double bodyMassIndex = vekt / (høyde * høyde);
	// Korter ned svar til kun to desimaler
	long roundedInt = Math.round(bodyMassIndex * 100); 
	double bodyMassIndexDesimal = (double) roundedInt/100;
	
	// Definerer BMI klasse
	if (bodyMassIndexDesimal < 18.5) { // Undervektig
			showMessageDialog(null, "BMI: " + bodyMassIndexDesimal + "\n" + "Du er undervektig!");
		}
		else if (bodyMassIndexDesimal < 24.9) { // Normal
			showMessageDialog(null, "BMI: " + bodyMassIndexDesimal + "\n" + "Du har normalvekt!");
		}
		else if (bodyMassIndexDesimal < 30) { // Overvekt
			showMessageDialog(null, "BMI: " + bodyMassIndexDesimal + "\n" + "Du er overvektig!");
		}
		else if (bodyMassIndexDesimal < 35) { // Fedme
			showMessageDialog(null, "BMI: " + bodyMassIndexDesimal + "\n" + "Du er kraftig overvektig!");	
		}
		else { // Super feit
			showMessageDialog(null, "BMI: " + bodyMassIndexDesimal + "\n" + "Åherregud...");
		}
	}
	
}
