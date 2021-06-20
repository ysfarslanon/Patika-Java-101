package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class sortingArray {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý diziler ödev 1
		// Dizideki Elemanlarý Sýralama
		// Dizideki elemanlarý küçükten büyüðe sýralayan programý yazýnýz.
		// Dizinin boyutunu ve dizinin elemanlarýný kullanýcýdan alýnýz.
		
		Scanner input = new Scanner(System.in);
				
		int n;		
		System.out.print("Dizinin boyutu n : ");
		n=input.nextInt();
		int[] numbers=new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print((i+1)+". Elemaný: ");
			numbers[i]=input.nextInt();
		}
		Arrays.sort(numbers);		
		System.out.print("Sýralama:"+Arrays.toString(numbers));
		
	}

}
