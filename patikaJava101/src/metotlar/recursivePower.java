package metotlar;

import java.util.Scanner;

public class recursivePower {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� Metotlar �dev 1
		// Recursive Metotlar ile �sl� Say� Hesaplama

		int base, power;

		Scanner input = new Scanner(System.in);

		System.out.print("Taban giriniz: ");
		base = input.nextInt();
		System.out.print("�s giriniz: ");
		power = input.nextInt();

		System.out.println("Sonu�: " + power(base, power));

	}

	static int power(int base, int power) {
		if(power==0) return 1;
		
		return base * power(base,power-1);
	}

}
