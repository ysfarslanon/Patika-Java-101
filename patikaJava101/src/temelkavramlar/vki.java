package temelkavramlar;

import java.util.Scanner;

public class vki {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� Temel kavramlar �dev 1
		// V�cut kitle indeksi hesaplayan program

		double height,weight,vki;

		Scanner input = new Scanner(System.in);

		System.out.print("L�tfen boyunuzu(metre cinsinden) giriniz: ");
		height = input.nextDouble();
		
		System.out.print("L�tfen kilonuzu giriniz: ");
		weight = input.nextDouble();
		
		vki=(weight/(height*height));
		System.out.print("V�cut Kitle �ndeksiniz: "+vki);
	}
}
