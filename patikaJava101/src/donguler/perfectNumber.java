package donguler;

import java.util.Scanner;

public class perfectNumber {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Döngüler ödev 2
		// Mükemmel Sayý Bulma
		// Bir sayýnýn kendisi hariç pozitif tam sayý çarpanlarý (kalansýz bölen sayýlarýn)
		// toplamý kendisine eþit olan sayýya mükemmel sayý denir.
		
		int n,total=0;

		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir sayý giriniz: ");
		n = input.nextInt();
		
		for (int i = 1; i <=n; i++) {
			if(n%i==0)
				total+=i;
		}
				
		if (n==total/2) {
			System.out.println(n+" Mükemmel sayýdýr.");
		} else {
			System.out.println(n+" Mükemmel sayý deðildir.");
		}

	}

}
