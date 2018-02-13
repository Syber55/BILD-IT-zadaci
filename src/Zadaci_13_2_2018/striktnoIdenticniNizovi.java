package Zadaci_13_2_2018;
import java.util.Scanner;

public class striktnoIdenticniNizovi {

	public static final Scanner in = new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.println("Unesi 10 brojeva u prvi niz");
		int[] niz1 = new int[10];
		for (int i=0; i<niz1.length; i++) {
			niz1[i] = in.nextInt();
		}
		System.out.println("Unesi 10 brojeva u drugi niz");
		int[] niz2 = new int[10];
		for (int i=0; i<niz2.length; i++) {
			niz2[i] = in.nextInt();
		}
		if (equals(niz1, niz2)) {
			System.out.println("Nizovi su identicni");
		}
		else {
			System.out.println("Nizovi nisu identicni");
		}
	}
	
	public static boolean equals(int niz1[], int niz2[]) {
		for (int i=0; i<niz1.length && i<niz2.length; i++) {
			if (niz1[i] != niz2[i]) {
				return false;
			}
		}
		return true;
	}

}
