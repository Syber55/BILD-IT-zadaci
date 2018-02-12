package Zadaci_12_2_2018;
import java.util.ArrayList;
import java.util.Scanner;

public class najvecaVrijednostArrayListe {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> niz = new ArrayList<>();
		System.out.println("Unesi 5 clanova u niz");
		for (int i=0; i<5; i++) {
			int broj = in.nextInt();
			niz.add(broj);
		}
		in.close();
		System.out.println(max(niz));
	}
	
	public static Integer max (ArrayList<Integer> list) {
		Integer najveci = 0;
		for (int i=0 ;i<list.size(); i++) {
			if (najveci < list.get(i)) {
				najveci = list.get(i);
			}
		}
		
		return najveci;
	}
}
