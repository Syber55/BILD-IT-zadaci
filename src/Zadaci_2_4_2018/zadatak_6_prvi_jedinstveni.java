package Zadaci_2_4_2018;

import java.io.*;
import java.util.*;

public class zadatak_6_prvi_jedinstveni {
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<String> unos = load();
		for(int i=0; i<unos.size(); i++) {
			provjera(unos.get(i));
		}
	}

	public static boolean provjera(char ch, String str) {
		int brojac = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				brojac++;
			}
		}
		if (brojac == 1) {
			return true;
		} else {
			return false;
		}

	}

	public static void provjera(String unos) {
		for (int i = 0; i < unos.length(); i++) {
			if (provjera(unos.charAt(i), unos)) {
				System.out.println(unos.charAt(i));
				break;
			}
		}
	}
	public static ArrayList<String> load() {
		ArrayList<String> unos = new ArrayList<>();
		System.out.print("Unesi ime fajla: ");
		String ime = in.nextLine();
		File fajl = new File(ime);
		if (!(fajl.exists())) {
			System.out.println("Ne postoji fajl...");
			System.exit(0);
		}
		try(Scanner inFile = new Scanner(fajl)){
			while(inFile.hasNext()) {
				unos.add(inFile.nextLine());
			}
		}
		catch(FileNotFoundException ex) {
			System.out.println("Ne postoji fajl...");
			System.exit(0);
		}
		return unos;
	}

}
