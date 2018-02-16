package Zadaci_15_2_2018;
import java.util.Scanner;
import java.lang.Math;

public class duzinaPiste {

	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Unesi željenu brzinu (m/S) i ubrzanje (m/s^2)");
		double brzina = in.nextDouble();
		double ubrzanje = in.nextDouble();
		double dužina = Math.pow(brzina, 2) / (2 * ubrzanje);
		dužina = Math.floor(dužina * 1000) / 1000;
		System.out.println("Minimalna dužina piste za ovaj avion je:" + dužina + " m.");
	}

}
