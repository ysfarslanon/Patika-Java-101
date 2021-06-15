package kosulluifadeler;

import java.util.Scanner;

public class artikYil {
	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Koþullu ifadeler ödev 3
		// Artýk Yýl Hesaplayan Program
		
		int yil;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Yýl giriniz: ");
		yil = input.nextInt();
		
		/*
		 * if (yil%4==0) { System.out.println(yil+" bir artýk yýldýr !"); } else
		 * if(yil%100==0) {
		 * if(yil%400==0)System.out.println(yil+" bir artýk yýl deðildir !"); }
		 * //System.out.println(yil+" bir artýk yýl deðildir !");
		 */	
		if (yil%100==0) {
			if (yil%400==0) {
				System.out.println("Artýk yil");
			}
		}else if(yil%4==0) System.out.println("Artýk yil deðil");
	
	
	}
}
