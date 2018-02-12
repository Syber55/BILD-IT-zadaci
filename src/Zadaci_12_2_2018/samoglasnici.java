package Zadaci_12_2_2018;
import java.util.Scanner;

public class samoglasnici {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesi recenicu");
		String recenica = in.nextLine();
		in.close();
		samoglasniciISuglasnici(recenica);
	}
	
	public static void samoglasniciISuglasnici(String recenica) {
		int samoglasnici = 0;
		int suglasnici = 0;
		for (int i=0; i<recenica.length(); i++) {
			if (Character.isLetter(recenica.charAt(i))) {
				if (recenica.charAt(i) == 'A' || recenica.charAt(i) == 'E' || recenica.charAt(i) == 'I' || recenica.charAt(i) == 'O' || recenica.charAt(i) == 'U' || recenica.charAt(i) == 'a' || recenica.charAt(i) == 'e' || recenica.charAt(i) == 'i' || recenica.charAt(i) == 'o' || recenica.charAt(i) == 'u') {
					samoglasnici++;
				}
				else {
					suglasnici++;
				}
			}
		}
		System.out.println("Recenica \"" + recenica + "\" ima " + samoglasnici + " samoglasnika i " + suglasnici + " suglasnika.");
	}

}
