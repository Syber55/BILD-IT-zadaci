package Zadaci_2_4_2018;
import java.util.*;

public class zadatak_4_nov�i�i {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Unesi koli�inu za isplatu");
		int broj = in.nextInt();
		in.close();
		int petak = broj / 5;
		int trojka = (broj % 5) / 3;
		int kec = (broj % 5) % 3;
		System.out.println("Minimalna koli�ina nov�i�a potrebna za isplatu je " + (petak+trojka+kec) + " nov�i�a.");
		System.out.print("(");
		for (int i=0; i<petak; i++) {
			System.out.print("5");
			petak--;
			i--;
			if(petak+trojka+kec > 0) {
				System.out.print(" + ");
			}
		}
		for (int i=0; i<trojka; i++) {
			System.out.print("3");
			trojka--;
			i--;
			if(trojka + kec > 0) {
				System.out.print(" + ");
			}
		}
		for (int i=0; i<kec; i++) {
			System.out.print("1");
			kec--;
			i--;
			if(kec > 0) {
				System.out.print(" + ");
			}
		}
		System.out.println(")");
	}

}
