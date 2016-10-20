package no.hib.dat100.Oppgave_1;

public class Array {
	private int[] tallrekke = { 1, 3, 5, 7, 9, 13, 15, 17, 19 };
	private int sum;
	
	public void skrivArray() {
		for (int i = 0; i < tallrekke.length; i++)
			System.out.println(i + ". " + " Verdi = " + tallrekke[i]);
	}
	public int regnArray() {		
		for (int el = 0; el < tallrekke.length; el++) {
			this.sum += el;
		}
		return this.sum;
	}
	public void resArray() {
		System.out.println("\nSummen av tabellen : " + regnArray());
	}
}
