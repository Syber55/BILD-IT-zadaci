package Zadaci_14_2_2018;
import java.util.Scanner;

public class stedniRacun {

	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Unesite mjesecni iznos stednje u KM:");
		double stednja = in.nextDouble();
		System.out.println("Unesite broj mjeseci nakon kojeg bi zeljeli znati stanje racuna: ");
		double mjeseci = in.nextDouble();
		double suma = 0;
		for (int i=0; i<mjeseci; i++) {
			suma = (suma + stednja) * (1 + 0.00417);
		}
		double konacanIznos = Math.floor(suma*100) / 100;
		System.out.println("Ustedili ste: " + konacanIznos + "KM");
	}

}
