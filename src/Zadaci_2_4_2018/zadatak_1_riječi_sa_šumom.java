package Zadaci_2_4_2018;
import java.util.Scanner;
import java.util.ArrayList;

public class zadatak_1_rije�i_sa_�umom {

	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<String> ulaz = new ArrayList<>();
		ArrayList<String> rje�enje = new ArrayList<>();
		String input = "";
		System.out.println("prekid prekida unos");
		input = in.nextLine();
		ulaz.add(input);
		for (int i=0; i<ulaz.size(); i++) {
			rje�enje.add(raspoznavanjeRije�i(ulaz.get(i)));
		}
		for (int i=0; i<rje�enje.size(); i++) {
			System.out.println(rje�enje.get(i));
		}
		
	}
	
	public static String raspoznavanjeRije�i(String str) {
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
