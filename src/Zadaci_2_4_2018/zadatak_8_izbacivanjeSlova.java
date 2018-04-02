package Zadaci_2_4_2018;

import java.util.*;

public class zadatak_8_izbacivanjeSlova {

	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		boolean bool = false;
		String reèenica = "";
		String filter = "";
		System.out.println("Unesi reèenicu i filter");
		String unos = in.nextLine();
		for (int i = 0; i < unos.length(); i++) {
			if (unos.charAt(i) == ',') {
				bool = true;
				continue;
			}
			if (!bool) {
				reèenica += unos.charAt(i);
			} else {
				if (unos.charAt(i) != ' ') {
					filter += unos.charAt(i);
				}
			}
		}
		System.out.println(filtriranje(reèenica, filter));
	}

	public static String filtriranje(String reèenica, String filter) {
		String izlaz = "";
		for (int i = 0; i < reèenica.length(); i++) {
			boolean bool = false;
			for (int j = 0; j < filter.length(); j++) {
				if (reèenica.charAt(i) == filter.charAt(j)) {
					bool = true;
				}
			}
			if (!bool) {
				izlaz += reèenica.charAt(i);
			}
		}
		return izlaz;
	}

}
