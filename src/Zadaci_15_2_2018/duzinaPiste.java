package Zadaci_15_2_2018;
import java.util.Scanner;
import java.lang.Math;

public class duzinaPiste {

	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Unesi �eljenu brzinu (m/S) i ubrzanje (m/s^2)");
		double brzina = in.nextDouble();
		double ubrzanje = in.nextDouble();
		double du�ina = Math.pow(brzina, 2) / (2 * ubrzanje);
		du�ina = Math.floor(du�ina * 1000) / 1000;
		System.out.println("Minimalna du�ina piste za ovaj avion je:" + du�ina + " m.");
	}

}
