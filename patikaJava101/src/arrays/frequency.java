package arrays;

import java.util.Arrays;

public class frequency {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� diziler �dev 2
		// Dizideki Elemanlar�n Frekans�n� Bulma
		// Dizideki elemanlar�n ka� kez tekrar edildi�ini yani frekanslar�n� bulan
		// program� yaz�n�z.

		int[] array = { 10, 20, 20, 10, 10, 20, 5, 20 };
		
		System.out.println("Dizi : " + Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println("\nTekrar Say�lar�");
		
		int count = 1;
		int current = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (current == array[i]) {
				count++;
				if (i == array.length - 1)
					System.out.println(current + " say�s� " + count + " kadar tekrar edildi.");
				continue;
			}
			System.out.println(current + " say�s� " + count + " kadar tekrar edildi.");

			count = 1;
			current = array[i];

		}

	}

}
