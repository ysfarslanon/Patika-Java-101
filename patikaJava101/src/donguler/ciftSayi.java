package donguler;

import java.util.Scanner;

public class ciftSayi {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� D�ng�ler pratik 1
		// Girilen Say�ya Kadar Olan �ift Say�lar� Bulan Program
		// Java d�ng�ler ile 0'dan girilen say�ya kadar olan say�lardan 3 ve 4'e tam b�l�nen say�lar�n ortalamas�n� hesaplayan program� yaz�n�z.
		
		int sayi,adet=0;
		int toplam=0;

		Scanner input = new Scanner(System.in);

		System.out.print("Say� giriniz: ");
		sayi = input.nextInt();

		for (int i = 0; i <= sayi; i++) {
			if (i%12==0) {//3 ve 4 e tam b�l�nen her say� 12 e tam b�l�n�r
				adet++;
				toplam+=i;				
			}
		}
		System.out.println("Ortalama= "+ (toplam/adet));
	}

}
