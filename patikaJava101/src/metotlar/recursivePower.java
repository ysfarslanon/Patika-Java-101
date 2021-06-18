package metotlar;

import java.util.Scanner;

public class recursivePower {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Metotlar ödev 1
		// Recursive Metotlar ile Üslü Sayý Hesaplama

		int base, power;

		Scanner input = new Scanner(System.in);

		System.out.print("Taban giriniz: ");
		base = input.nextInt();
		System.out.print("Üs giriniz: ");
		power = input.nextInt();

		System.out.println("Sonuç: " + power(base, power));

	}

	static int power(int base, int power) {
		if(power==0) return 1;
		
		return base * power(base,power-1);
	}

}
