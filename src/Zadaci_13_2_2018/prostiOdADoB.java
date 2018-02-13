package Zadaci_13_2_2018;
import java.util.Scanner;

public class prostiOdADoB {

	public static final Scanner in = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Unesi pocetni broj, krajnji broj i broj brojeva u jednom redu.");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		primeRange(a, b, c);
	}
	
	public static void primeRange (int a, int b, int c) {
		int counter = 1;
		for (int i=a; i<=b; i++) {
			if (isPrime(i)) {
				if (counter < c) {
					System.out.print(i + " ");
					counter++;
				}
				else {
					System.out.println(i);
					counter = 1;
				}
			}
		}
	}
	
	public static boolean isPrime (int a) {
		for (int i=2; i<=a/2; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

}
