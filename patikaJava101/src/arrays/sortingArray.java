package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class sortingArray {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� diziler �dev 1
		// Dizideki Elemanlar� S�ralama
		// Dizideki elemanlar� k���kten b�y��e s�ralayan program� yaz�n�z.
		// Dizinin boyutunu ve dizinin elemanlar�n� kullan�c�dan al�n�z.
		
		Scanner input = new Scanner(System.in);
				
		int n;		
		System.out.print("Dizinin boyutu n : ");
		n=input.nextInt();
		int[] numbers=new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print((i+1)+". Eleman�: ");
			numbers[i]=input.nextInt();
		}
		Arrays.sort(numbers);		
		System.out.print("S�ralama:"+Arrays.toString(numbers));
		
	}

}
