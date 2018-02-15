package Zadaci_14_2_2018;
import java.util.Scanner;

public class obrnutiRedoslijedBrojeva {

	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Unesi 10 brojeva");
		int[] niz = new int[10];
		for (int i=0; i<niz.length; i++) {
			niz[i] = in.nextInt();
		}
		for(int i=niz.length-1; i>=0; i--) {
			System.out.print(niz[i]);
		}
	}

}
