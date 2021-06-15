package temelkavramlar;

import java.util.Scanner;

public class vki {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Temel kavramlar ödev 1
		// Vücut kitle indeksi hesaplayan program

		double height,weight,vki;

		Scanner input = new Scanner(System.in);

		System.out.print("Lütfen boyunuzu(metre cinsinden) giriniz: ");
		height = input.nextDouble();
		
		System.out.print("Lütfen kilonuzu giriniz: ");
		weight = input.nextDouble();
		
		vki=(weight/(height*height));
		System.out.print("Vücut Kitle Ýndeksiniz: "+vki);
	}
}
