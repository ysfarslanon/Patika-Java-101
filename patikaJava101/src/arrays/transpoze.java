package arrays;

import java.util.Arrays;

public class transpoze {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� diziler �dev 3
		// Matrisin Transpozu
		// �ok boyutlu diziler ile olu�turulmu� matrisin transpozunu bulan program�
		// yaz�n�z.

		int[][] m = { 
				{ 2, 3, 4 },
				{ 5, 6, 4 } 
				};
		int[][] mT = new int[m[0].length][m.length];
		
		System.out.println("Matris :");
		writeMatris(m);

		for (int row = 0; row < m.length; row++) {
			for (int column = 0; column < m[0].length; column++) {
				mT[column][row] = m[row][column];

			}
		}
		System.out.println("\nTranspoze :");
		writeMatris(mT);

	}

	public static void writeMatris(int[][] matris) {
		for (int row = 0; row < matris.length; row++) {
			for (int column = 0; column < matris[0].length; column++) {
				System.out.print(matris[row][column] + " \t");

			}
			System.out.println();
		}
	}

}
