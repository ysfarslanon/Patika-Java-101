package donguler;

import java.util.Scanner;

public class dortVeBes {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� D�ng�ler pratik 3
		// Girilen Say�dan K���k 2�nin Kuvvetlerini Bulan Program
		// Java d�ng�ler ile girilen say�ya kadar olan 4 ve 5'in kuvvetlerini ekrana yazd�ran program� yaz�yoruz.
		
		int number;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Say� giriniz: ");
		number=input.nextInt();
		
		for (int i = 1; i <=number; i*=4) {
			System.out.println("4. Kuvvetler: "+i);
		}
		for (int i = 1; i <=number; i*=5) {
			System.out.println("5. Kuvvetler: "+i);
		}
	}

}
