package metotlar;

import java.util.Scanner;

public class palindromNumber {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� Metotlar pratik 1
		// Palindrom Say� Bulan Program
		// Palindromik say�, iki taraftan okundu�u zaman okunu� y�n�yle ayn� olan say�lard�r.
		// 1 - 4 - 8 - 99 - 101 - 363 - 4004 ...

		Scanner input = new Scanner(System.in);

		int n;
		System.out.print("Say� giriniz: ");
		n = input.nextInt();
		
		System.out.println(isPalindrom(n)?"Palindrom say�d�r.":"Palindrom say� de�ildir.");

	}

	static boolean isPalindrom(int number) {
		int temp = number, reverseNumber = 0, lastNumber;

		while (temp != 0) {
			lastNumber = temp % 10;
			reverseNumber = (reverseNumber * 10) + lastNumber;
			temp /= 10;
		}
		if (number == reverseNumber)
			return true;
		else
			return false;
	}

}
