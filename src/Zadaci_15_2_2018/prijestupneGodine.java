package Zadaci_15_2_2018;
import java.util.Scanner;

public class prijestupneGodine {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesi poèetnu i završnu godinu.");
		int poèetak = in.nextInt();
		int kraj = in.nextInt();
		int j = 1;
		for (int i = poèetak; i < kraj; i++) {
			if (j % 10!=0) {
				if ((i % 4 == 0 && i % 100 != 0) || (i % 100 == 0 && i % 400 == 0)) {
					System.out.print(i + " ");
					j++;
				}
			} else {
				if ((i % 4 == 0 && i % 100 != 0) || (i % 100 == 0 && i % 400 == 0)) {
					System.out.println(i + " ");
					j++;
				}
			}
		}
		in.close();
	}

}
