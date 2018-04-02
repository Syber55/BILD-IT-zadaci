package Zadaci_2_4_2018;
import java.util.*;
public class zadatak_7_broj_prostih_u_rasponu {

	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int a = in.nextInt();
		int b = in.nextInt();
		int kolièina = 0;
		for (int i=a; i<=b; i++) {
			if(zadatak_2_suma_prvih_1000_prostih_brojeva.isPrime(i)) {
				kolièina++;
			}
		}
		System.out.println(kolièina);
	}

}
