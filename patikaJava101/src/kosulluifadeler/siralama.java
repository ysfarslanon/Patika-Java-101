package kosulluifadeler;

import java.util.Scanner;

public class siralama {
	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� Ko�ullu ifadeler pratik 5
		// Say�lar� K���kten B�y��e S�ralayan Program		

		int a,b,c;
		Scanner input = new Scanner(System.in);

		System.out.print("Birinci(a) say�y� giriniz: ");
		a = input.nextInt();
		
		System.out.print("�kinci(b) say�y� giriniz: ");
		b = input.nextInt();
		
		System.out.print("���nc�(c) say�y� giriniz: ");
		c = input.nextInt();
		
		if (a<b&&a<c) {
			if (b<c) System.out.println("a<b<c");
			else System.out.println("a<c<b");			
		} else if(b<a&&b<c) {
			if (a<c) System.out.println("b<a<c");
			else System.out.println("b<c<a");				
		}else {
			if (b<a) 
				System.out.println("c<b<a");
			else System.out.println("c<a<b");
		}
	}
}
