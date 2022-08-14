package iks_oks;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Iks_Oks01 {

	static String[] tabla;
	static String potez;
	
	
//	Dobitne kombinacije za proveriPobednika --->
	
	static String proveriPobednika() {

		for (int i = 0; i < 8; i++) {
			String linija = null;

			switch (i) {
			case 0:
				linija = tabla[0] + tabla[1] + tabla[2];
				break;
			case 1:
				linija = tabla[3] + tabla[4] + tabla[5];
				break;
			case 2:
				linija = tabla[6] + tabla[7] + tabla[8];
				break;
			case 3:
				linija = tabla[0] + tabla[3] + tabla[6];
				break;
			case 4:
				linija = tabla[1] + tabla[4] + tabla[7];
				break;
			case 5:
				linija = tabla[2] + tabla[5] + tabla[8];
				break;
			case 6:
				linija = tabla[0] + tabla[4] + tabla[8];
				break;
			case 7:
				linija = tabla[2] + tabla[4] + tabla[6];
				break;
			}
			
//			X = pobednik
			if (linija.equals("XXX")) {
				return "X";
			} 
//			O = pobednik
			else if (linija.equals("OOO")) {
				return "O";
			}
		}

		for (int i = 0; i < 9; i++) {
			if (Arrays.asList(tabla).contains(String.valueOf(i + 1))) {
				break;
			} 
			else if (i == 8) {
				return "nereseno";
			}
		}
//		X/O na pravom mestu na tabli
		System.out.print(potez + " je na redu. Unesite broj polja u koje zelite " + potez + " da smestite: ");
		return null;
	}


//		Izgled table
//		Ideja: NESTO PROSTIJE? Sa +- mozda? ------------ TESTIRAJ --------------
	static void stampaTabla() {

		System.out.println("|---|---|---|");
		System.out.println("| " + tabla[0] + " | " + tabla[1] + " | " + tabla[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + tabla[3] + " | " + tabla[4] + " | " + tabla[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + tabla[6] + " | " + tabla[7] + " | " + tabla[8] + " |");
		System.out.println("|---|---|---|");

	}

//	NAPOKON PROGRAM :D
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		tabla = new String[9];
		potez = "X";
		String pobednik = null;

//		Oznake polja u tabeli ===>
		for (int i = 0; i < 9; i++) {
			tabla[i] = String.valueOf(i + 1);
		}

		System.out.println("Dobrodosli! :)");
//		Ideja: Mozda uneti imena igraca kroz scanner i preko randoma resiti ko je X?
//		Vezati ime i random (0 = X; 1 = O ===> prvo ime = prvi random)???
//		Lagano preko IF-a?
//		Koristi i u zadnjoj stampi
//		Ideja: igrac vs komp (random broj = polje?) ---- mozda moze da ima neku logiku da nije random? da se brani za pocetak da ne dozvoli da se sklope XXX? hmm
		
		stampaTabla();

		System.out.println("X igra prvi. Unesite broj polja u koje zelite X da smestite: ");

		while (pobednik == null) {
			int brojPolja;

//			CISTO AKO SE PRAVE PAMETNI - TESTIRANO
			try {
				brojPolja = s.nextInt();
				if (!(brojPolja > 0 && brojPolja <= 9)) {
					System.out.println("STVARNO!? " + brojPolja + "???\r\nUnesi broj ponovo(1-9): ");
					continue;
				}
			}

			catch (InputMismatchException e) {	// POPRAVLJENO!!! ------------ PROBLEM: INFINITE LOOP -------------
				System.out.println("STVARNO!? Unesite broj ponovo(1-9): ");
				s.nextLine();					// POPRAVILO IFNFINIT LOOP :)
				continue;
			}

//			Ko je na potezu ---------------- BITAN DEO --------------------
			if (tabla[brojPolja - 1].equals(String.valueOf(brojPolja))) {
				tabla[brojPolja - 1] = potez;

				if (potez.equals("X")) {
					potez = "O";
				} 
				else {
					potez = "X";
				}
				stampaTabla();
				pobednik = proveriPobednika();
			} 
			else {
				System.out.println("Mesto je zauzeto! Unesite broj ponovo: ");
			}
		}
		
//		Nereseno - TESTIRANO
		if (pobednik.equals("nereseno")) {
			System.out.println("Nereseno! GG :)");
		} 
		else {
			System.out.println("Cestitamo! " + pobednik + " je pobedio! GG & WP!!! :)))");
		}

	}

}
