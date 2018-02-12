package Zadaci_12_2_2018;
import java.util.Scanner;

public class ponavljanjeNajvecegBroja {
	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Unesite zeljenu duzinu niza");
		int duzina = in.nextInt();
		int[] niz = ucitavanje(duzina);
		int max = najveci(niz);
		brojac(max, niz);
	}
	
	public static int[] ucitavanje(int n) {
		int[] niz = new int[n];
		for (int i=0; i<niz.length; i++) {
			niz[i] = in.nextInt();
		}
		return niz;
	}
	public static int najveci (int[] niz) {
		int max = 0;
		for (int i=0; i<niz.length; i++) {
			if (max < niz[i]) {
				max = niz[i];
			}
		}
		return max;
	}
	public static void brojac(int max, int[] niz) {
		int brojac = 0;
		for (int i=0; i<niz.length; i++) {
			if (niz[i] == max) {
				brojac++;
			}
		}
		System.out.println("Najveci broj je " + max + " i ponavlja se " + brojac + " puta.");
	}
}
