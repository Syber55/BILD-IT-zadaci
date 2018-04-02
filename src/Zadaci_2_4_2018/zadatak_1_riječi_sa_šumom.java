package Zadaci_2_4_2018;
import java.util.Scanner;
import java.util.ArrayList;

public class zadatak_1_rijeèi_sa_šumom {

	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<String> ulaz = new ArrayList<>();
		ArrayList<String> rješenje = new ArrayList<>();
		String input = "";
		System.out.println("prekid prekida unos");
		input = in.nextLine();
		ulaz.add(input);
		for (int i=0; i<ulaz.size(); i++) {
			rješenje.add(raspoznavanjeRijeèi(ulaz.get(i)));
		}
		for (int i=0; i<rješenje.size(); i++) {
			System.out.println(rješenje.get(i));
		}
		
	}
	
	public static String raspoznavanjeRijeèi(String str) {
		boolean razmak=false;
		String izlaz = "";
		for (int i=0; i<str.length(); i++) {
			if (!Character.isLetter(str.charAt(i))) {
				razmak = true;
			}
			else if(razmak && Character.isLetter(str.charAt(i))) {
				izlaz +=" " + Character.toLowerCase(str.charAt(i));
				razmak = false;
			}
			else {
				izlaz += Character.toLowerCase(str.charAt(i));
			}
		}
		return izlaz;
	}

}
