package Zadaci_14_2_2018;
import java.util.Scanner;

public class zajednickiPrefix {

	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Unesi prvi string");
		String s1 = in.nextLine();
		System.out.println("Unesi drugi string");
		String s2 = in.nextLine();
		String prefiks = zajednickiPrefiks(s1, s2);
		if (prefiks.length() == 0) {
			System.out.println("Ova dva stringa nemaju zajednicki prefiks.");
		}
		else {
			System.out.println("Zajednicki prefiks za ova dva stringa je: " + prefiks);
		}
	}
	public static String zajednickiPrefiks (String s1, String s2) {
		String zajednicki = "";
		for (int i=0; i<s1.length() && i<s2.length(); i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				zajednicki+=s1.charAt(i);
			}
			else {
				return zajednicki;
			}
		}
		return zajednicki;
	}

}
