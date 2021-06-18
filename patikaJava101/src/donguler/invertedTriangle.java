package donguler;

import java.util.Scanner;

public class invertedTriangle {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Döngüler ödev 3
		// Ters Üçgen Yapýmý
		// Java ile basamak sayýsýnýn kullanýcýdan alýnan ve döngüler kullanýlarak, yýldýzlar(*) ile 
		// ekrana ters üçgen çizen programý yazýn.
		
		int n;

		Scanner input = new Scanner(System.in);

		System.out.print("Basamak sayýsý giriniz: ");
		n = input.nextInt();
		
		for (int i = n; i >=1; i--) {			
			for (int j = 0; j <=(n-i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=(2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
