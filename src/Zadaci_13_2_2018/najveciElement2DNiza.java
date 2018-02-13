package Zadaci_13_2_2018;
import java.util.Scanner;

public class najveciElement2DNiza {

	public static final Scanner in = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Unesi 3x3 niz");
		double niz2d[][] = new double[3][3];
		for (int i=0; i<niz2d.length; i++) {
			for (int j=0; j<niz2d[0].length; j++) {
				niz2d[i][j] = in.nextDouble();
			}
		}
		int niz[] = locateLargest(niz2d);
		System.out.println("Koordinate najveceg elementa u 3x3 nizu su " + niz[0] + " " + niz[1]);
	}
	public static int[] locateLargest(double[][] niz) {
		double max = 0;
		int[] koordinate = new int[2];
		for (int i=0; i<niz.length; i++) {
			for (int j=0; j<niz[0].length; j++) {
				if (max < niz[i][j]) {
					max = niz[i][j];
					koordinate[0] = i;
					koordinate[1] = j;
				}
			}
		}
		return koordinate;
	}
}
