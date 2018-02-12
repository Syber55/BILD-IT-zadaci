package Zadaci_12_2_2018;
import java.util.Scanner;

public class najveciZajednickiDjelilac {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesi dva broja.");
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
		djelilac(a,b);
	}
	
	public static void djelilac (int a, int b) {
		int divider = 1;
		for (int i=1; i<=a && i<=b; i++) {
			if (a % i == 0 && b % i == 0) {
				divider = i;
			}
		}
		System.out.println("Najveci zajednicki djelilac za brojeve " + a + " i " + b + " je " + divider + ".");
	}

}
