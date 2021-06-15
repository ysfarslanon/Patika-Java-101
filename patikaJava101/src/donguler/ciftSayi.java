package donguler;

import java.util.Scanner;

public class ciftSayi {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Döngüler pratik 1
		// Girilen Sayýya Kadar Olan Çift Sayýlarý Bulan Program
		// Java döngüler ile 0'dan girilen sayýya kadar olan sayýlardan 3 ve 4'e tam bölünen sayýlarýn ortalamasýný hesaplayan programý yazýnýz.
		
		int sayi,adet=0;
		int toplam=0;

		Scanner input = new Scanner(System.in);

		System.out.print("Sayý giriniz: ");
		sayi = input.nextInt();

		for (int i = 0; i <= sayi; i++) {
			if (i%12==0) {//3 ve 4 e tam bölünen her sayý 12 e tam bölünür
				adet++;
				toplam+=i;				
			}
		}
		System.out.println("Ortalama= "+ (toplam/adet));
	}

}
