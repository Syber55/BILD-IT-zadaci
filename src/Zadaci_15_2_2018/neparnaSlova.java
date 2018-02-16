package Zadaci_15_2_2018;
import java.util.Scanner;

public class neparnaSlova {

	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Unesi string");
		String s1 = in.nextLine();
		System.out.println(neparni(s1));
	}
	
	public static String neparni (String s1) {
		String s2 = "";
		for (int i=0; i<s1.length(); i++) {
			if (i%2==0) {
				s2+=s1.charAt(i);
			}
		}
		return s2;
	}

}
