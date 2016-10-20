package no.hib.dat100.Fak;

public class Fak {
	public static void main(String[] args) {
		Fak dd = new Fak();
		System.out.println("3! = " + dd.fakultet(3));
		System.out.println("7! = " + dd.fakultet(7));
		
	}
	
	int fakultet(int i) {
		System.out.println("Kall: fakultet(" + i + ")");
		int res;
		if (i == 0) {
			res = 1;
		} else {
			res = i * fakultet (i - 1); // Rekursivt kall
		}
		return res;
	}
}
