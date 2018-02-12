package Zadaci_12_2_2018;
import java.lang.Math;

public class ponavljanjeNasumicnihBrojeva {

	public static void main(String[] args) {
		System.out.println("Ovaj program generise nasumicne brojeve 0-9 i broji koji se broj koliko puta ponavlja.");
		brojac();
	}
	
	public static int Random() {
		int a = (int)(Math.random()*10);
		return a;
	}
	
	public static void brojac () {
		int a;
		int[] num = new int[10];
		for (int i=0; i<100; i++) {
			a = Random();
			num[a]++;
		}
		for (int i=0; i<num.length; i++) {
			System.out.println(i);
			System.out.println(num[i]);
			System.out.println();
		}
	}

}
