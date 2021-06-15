package kosulluifadeler;

import java.util.Scanner;

public class siralama {
	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Koþullu ifadeler pratik 5
		// Sayýlarý Küçükten Büyüðe Sýralayan Program		

		int a,b,c;
		Scanner input = new Scanner(System.in);

		System.out.print("Birinci(a) sayýyý giriniz: ");
		a = input.nextInt();
		
		System.out.print("Ýkinci(b) sayýyý giriniz: ");
		b = input.nextInt();
		
		System.out.print("Üçüncü(c) sayýyý giriniz: ");
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
