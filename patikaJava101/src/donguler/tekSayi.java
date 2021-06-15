package donguler;

import java.util.Scanner;

public class tekSayi {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Döngüler pratik 2
		// Tek Sayýlarýn Toplamýný Bulan Program
		/*
		 * Java döngüler ile tek bir sayý girilene kadar kullanýcýdan giriþleri kabul
		 * eden ve girilen deðerlerden çift ve 4'ün katlarý olan sayýlarý toplayýp
		 * ekrana basan programý yazýyoruz.
		 */

		int number,total=0;

		Scanner input = new Scanner(System.in);

		do {
			System.out.print("Sayý giriniz: ");
			number = input.nextInt();
			if(number%4==0) {//4 ün katlarý her zaman çifttir.Çift kontrolüne gerek yok
				total+=number;
			}
		} while (number%2==0);
			System.out.println("Toplam: "+total);
	}

}
