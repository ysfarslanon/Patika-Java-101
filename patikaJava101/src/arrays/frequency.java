package arrays;

import java.util.Arrays;

public class frequency {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý diziler ödev 2
		// Dizideki Elemanlarýn Frekansýný Bulma
		// Dizideki elemanlarýn kaç kez tekrar edildiðini yani frekanslarýný bulan
		// programý yazýnýz.

		int[] array = { 10, 20, 20, 10, 10, 20, 5, 20 };
		
		System.out.println("Dizi : " + Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println("\nTekrar Sayýlarý");
		
		int count = 1;
		int current = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (current == array[i]) {
				count++;
				if (i == array.length - 1)
					System.out.println(current + " sayýsý " + count + " kadar tekrar edildi.");
				continue;
			}
			System.out.println(current + " sayýsý " + count + " kadar tekrar edildi.");

			count = 1;
			current = array[i];

		}

	}

}
