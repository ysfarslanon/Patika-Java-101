package donguler;

import java.util.Scanner;

public class dortVeBes {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Döngüler pratik 3
		// Girilen Sayýdan Küçük 2’nin Kuvvetlerini Bulan Program
		// Java döngüler ile girilen sayýya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdýran programý yazýyoruz.
		
		int number;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Sayý giriniz: ");
		number=input.nextInt();
		
		for (int i = 1; i <=number; i*=4) {
			System.out.println("4. Kuvvetler: "+i);
		}
		for (int i = 1; i <=number; i*=5) {
			System.out.println("5. Kuvvetler: "+i);
		}
	}

}
