package Zadaci_13_2_2018;
import java.util.Scanner;

public class najmanjiDecimalniBroj {

	public static final Scanner in = new Scanner (System.in);
	public static void main(String[] args) {
		double[] niz = new double[10];
		System.out.println("Unesi 10 decimalnih brojeva.");
		for(int i=0; i<niz.length; i++) {
			niz[i] = in.nextDouble();
			System.out.println("Unesi slijedeci broj");
		}
		System.out.println("Najmanji decimalni broj u datom nizu je " + min(niz));
	}
	
	public static double min(double[] niz) {
		double najmanji = niz[0];
		for (int i=0; i<niz.length; i++) {
			if (najmanji > niz[i]) {
				najmanji = niz[i];
			}
		}
		return najmanji;
	}

}
