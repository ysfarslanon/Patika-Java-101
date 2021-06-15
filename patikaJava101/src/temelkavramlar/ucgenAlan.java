package temelkavramlar;

import java.util.Scanner;


public class ucgenAlan {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Temel kavramlar pratik 3
		// Üçgenin alanýný hesaplayan program
		
		double kenar1,kenar2,kenar3;
		double u,alan;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Birinci kenar deðerini giriniz: ");
		kenar1=input.nextInt();

		System.out.print("Ýkinci kenar deðerini giriniz: ");
		kenar2=input.nextInt();
		
		System.out.print("Üçüncü kenar deðerini giriniz: ");
		kenar3=input.nextInt();
		
		
		
		u=(kenar1+kenar2+kenar3)/2;		
		
		
		alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
		
		System.out.println("Üçgen alaný:"+alan+ "  "+u );
		
		
	}

}
