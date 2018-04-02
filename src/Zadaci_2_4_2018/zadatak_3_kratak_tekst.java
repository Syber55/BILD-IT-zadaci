package Zadaci_2_4_2018;

import java.io.*;
import java.util.*;

public class zadatak_3_kratak_tekst {

	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Unesi ime fajla: ");
		String ime = in.nextLine();
		File fajl = new File(ime);
		if (!(fajl.exists())) {
			System.out.println("Ne postoji fajl...");
			System.exit(0);
		}
		String s1 = "";
		try (Scanner inFile = new Scanner(fajl)) {
			while (inFile.hasNext()) {
				s1 = inFile.nextLine();
				if (s1.length() > 55) {
					for (int i = 0; i < 40; i++) {
						System.out.print(s1.charAt(i));
					}
					System.out.println("...<Read More>");
				} else {
					System.out.println(s1);
				}
			}
		} catch (FileNotFoundException ex) {
			System.out.println("Ne postoji fajl...");
			System.exit(0);
		}
	}

}
