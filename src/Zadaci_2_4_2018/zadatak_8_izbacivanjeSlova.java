package Zadaci_2_4_2018;

import java.util.*;

public class zadatak_8_izbacivanjeSlova {

	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		boolean bool = false;
		String re�enica = "";
		String filter = "";
		System.out.println("Unesi re�enicu i filter");
		String unos = in.nextLine();
		for (int i = 0; i < unos.length(); i++) {
			if (unos.charAt(i) == ',') {
				bool = true;
				continue;
			}
			if (!bool) {
				re�enica += unos.charAt(i);
			} else {
				if (unos.charAt(i) != ' ') {
					filter += unos.charAt(i);
				}
			}
		}
		System.out.println(filtriranje(re�enica, filter));
	}

	public static String filtriranje(String re�enica, String filter) {
		String izlaz = "";
		for (int i = 0; i < re�enica.length(); i++) {
			boolean bool = false;
			for (int j = 0; j < filter.length(); j++) {
				if (re�enica.charAt(i) == filter.charAt(j)) {
					bool = true;
				}
			}
			if (!bool) {
				izlaz += re�enica.charAt(i);
			}
		}
		return izlaz;
	}

}
