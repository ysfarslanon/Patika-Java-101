package donguler;


import java.util.Scanner;

public class diamondStar {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Döngüler pratik 8
		// Yýldýzlar ile Üçgen Yapýmý
		// Java'da döngüler kullanarak yýldýzlar ile elmas yapýnýz.

		int n, result = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Sayý giriniz: ");
		n = input.nextInt();
		
		//üst üçgen
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=(n-i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=(2*i)-1; j++) {
				System.out.print("*");
			}		
			System.out.println();
		}
		//alt üçgen
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <=(n-i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=(2*i)-1; j++) {
				System.out.print("*");
			}		
			System.out.println();
		}
		

	}

}
