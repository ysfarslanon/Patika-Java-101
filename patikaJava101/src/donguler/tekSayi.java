package donguler;

import java.util.Scanner;

public class tekSayi {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� D�ng�ler pratik 2
		// Tek Say�lar�n Toplam�n� Bulan Program
		/*
		 * Java d�ng�ler ile tek bir say� girilene kadar kullan�c�dan giri�leri kabul
		 * eden ve girilen de�erlerden �ift ve 4'�n katlar� olan say�lar� toplay�p
		 * ekrana basan program� yaz�yoruz.
		 */

		int number,total=0;

		Scanner input = new Scanner(System.in);

		do {
			System.out.print("Say� giriniz: ");
			number = input.nextInt();
			if(number%4==0) {//4 �n katlar� her zaman �ifttir.�ift kontrol�ne gerek yok
				total+=number;
			}
		} while (number%2==0);
			System.out.println("Toplam: "+total);
	}

}
