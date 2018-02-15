package Zadaci_14_2_2018;
import java.util.Scanner;
public class brojanjeSlova {

	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Unesi string.");
		String s1 = in.nextLine();
		System.out.println("U stringu \"" + s1 + "\" ima " + brojanje(s1) + " slova.");
	}
	
	public static int brojanje (String s1) {
		int counter = 0;
		for (int i=0; i<s1.length(); i++) {
			if (Character.isLetter(s1.charAt(i))) {
				counter++;
			}
		}
		return counter;
	}

}
