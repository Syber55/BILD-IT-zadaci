package Zadaci_15_2_2018;
import java.util.Scanner;

public class palindromi {

	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Unesi broj");
		int a = in.nextInt();
		if (isPalindrome(a)) {
			System.out.println("Broj " + a + " je palindrom");
		}
		else {
			System.out.println("Broj " + a + " nije palindrom");
		}
	}
	
	public static int reversal (int a) {
		int b=0;
		while (a > 0) {
			b = b*10 + a%10;
			a = a/10;
		}
		return b;
	}
	
	public static boolean isPalindrome (int a) {
		if (a == reversal(a)) {
			return true;
		}
		else {
			return false;
		}
	}
}
