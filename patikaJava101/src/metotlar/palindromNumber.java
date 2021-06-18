package metotlar;

import java.util.Scanner;

public class palindromNumber {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikası Metotlar pratik 1
		// Palindrom Sayı Bulan Program
		// Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
		// 1 - 4 - 8 - 99 - 101 - 363 - 4004 ...

		Scanner input = new Scanner(System.in);

		int n;
		System.out.print("Sayı giriniz: ");
		n = input.nextInt();
		
		System.out.println(isPalindrom(n)?"Palindrom sayıdır.":"Palindrom sayı değildir.");

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
