package donguler;

import java.util.Scanner;

public class perfectNumber {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� D�ng�ler �dev 2
		// M�kemmel Say� Bulma
		// Bir say�n�n kendisi hari� pozitif tam say� �arpanlar� (kalans�z b�len say�lar�n)
		// toplam� kendisine e�it olan say�ya m�kemmel say� denir.
		
		int n,total=0;

		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir say� giriniz: ");
		n = input.nextInt();
		
		for (int i = 1; i <=n; i++) {
			if(n%i==0)
				total+=i;
		}
				
		if (n==total/2) {
			System.out.println(n+" M�kemmel say�d�r.");
		} else {
			System.out.println(n+" M�kemmel say� de�ildir.");
		}

	}

}
