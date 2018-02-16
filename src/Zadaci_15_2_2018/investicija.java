package Zadaci_15_2_2018;
import java.lang.Math;
import java.util.Scanner;

public class investicija {

	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Unesite iznos investicije.");
		double investicija = in.nextDouble();
		System.out.println("Unesite godisnju interesnu stopu");
		double mjesecniInteres = in.nextDouble();
		mjesecniInteres /= 1200;
		System.out.println("Unesite broj godina");
		double brojGodina = in.nextDouble();
		double buducaVrijednostInvesticije = investicija * Math.pow(1+mjesecniInteres, brojGodina*12);
		buducaVrijednostInvesticije = Math.floor(buducaVrijednostInvesticije * 100) / 100;
		System.out.println("Buduca vrrijednost investicije je: " + buducaVrijednostInvesticije);
	}

}
