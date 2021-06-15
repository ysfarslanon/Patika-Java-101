package donguler;

import java.util.Scanner;

public class usluSayi {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Döngüler pratik 5
		// Üslü Sayý Hesaplayan Program
		
		int n,x,total=1;

		Scanner input = new Scanner(System.in);
		
		System.out.print("Taban giriniz: ");
		n=input.nextInt();
		
		System.out.print("Üs giriniz: ");
		x=input.nextInt();
		
		for (int i = 1; i <=x; i++) {
			total*=n;
		}
		System.out.print("Sonuç: "+total);
	}

}
