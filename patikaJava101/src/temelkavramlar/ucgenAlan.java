package temelkavramlar;

import java.util.Scanner;


public class ucgenAlan {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� Temel kavramlar pratik 3
		// ��genin alan�n� hesaplayan program
		
		double kenar1,kenar2,kenar3;
		double u,alan;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Birinci kenar de�erini giriniz: ");
		kenar1=input.nextInt();

		System.out.print("�kinci kenar de�erini giriniz: ");
		kenar2=input.nextInt();
		
		System.out.print("���nc� kenar de�erini giriniz: ");
		kenar3=input.nextInt();
		
		
		
		u=(kenar1+kenar2+kenar3)/2;		
		
		
		alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
		
		System.out.println("��gen alan�:"+alan+ "  "+u );
		
		
	}

}
