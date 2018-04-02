package Zadaci_2_4_2018;

public class zadatak_2_suma_prvih_1000_prostih_brojeva {

	public static void main(String[] args) {
		int suma = 0;
		int i=0;
		int j=2; 
		while (i<1000) {
			if (isPrime(j)) {
				i++;
				suma+=j;
			}
			j++;
		}
		System.out.println(suma);
	}
	
	public static boolean isPrime(int a) {
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

}
