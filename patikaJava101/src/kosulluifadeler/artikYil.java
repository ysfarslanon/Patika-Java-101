package kosulluifadeler;

import java.util.Scanner;

public class artikYil {
	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� Ko�ullu ifadeler �dev 3
		// Art�k Y�l Hesaplayan Program
		
		int yil;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Y�l giriniz: ");
		yil = input.nextInt();
		
		/*
		 * if (yil%4==0) { System.out.println(yil+" bir art�k y�ld�r !"); } else
		 * if(yil%100==0) {
		 * if(yil%400==0)System.out.println(yil+" bir art�k y�l de�ildir !"); }
		 * //System.out.println(yil+" bir art�k y�l de�ildir !");
		 */	
		if (yil%100==0) {
			if (yil%400==0) {
				System.out.println("Art�k yil");
			}
		}else if(yil%4==0) System.out.println("Art�k yil de�il");
	
	
	}
}
