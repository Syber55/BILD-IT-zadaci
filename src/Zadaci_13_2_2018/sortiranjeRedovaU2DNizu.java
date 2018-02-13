package Zadaci_13_2_2018;
import java.util.Scanner;

public class sortiranjeRedovaU2DNizu {

	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Unesi 3x3 matricu");
		double[][] niz = new double[3][3];
		for (int i=0; i<niz.length; i++) {
			for (int j=0; j<niz[0].length; j++) {
				niz[i][j] = in.nextDouble();
			}
		}
		niz = sortRows(niz);
		for (int i=0; i<niz.length; i++) {
			for (int j=0; j<niz.length; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static double[][] sortRows(double[][] niz){
		double numholder = 0;
		for (int i=0; i<niz.length; i++) {
			for (int j=1; j<niz[0].length; j++) {
				if (niz[i][j-1]>niz[i][j]) {
					numholder = niz[i][j-1];
					niz[i][j-1] = niz[i][j];
					niz[i][j] = numholder;
					numholder = 0;
				}
			}
		}
		return niz;
	}

}
