package donguler;

import java.util.Scanner;

public class invertedTriangle {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� D�ng�ler �dev 3
		// Ters ��gen Yap�m�
		// Java ile basamak say�s�n�n kullan�c�dan al�nan ve d�ng�ler kullan�larak, y�ld�zlar(*) ile 
		// ekrana ters ��gen �izen program� yaz�n.
		
		int n;

		Scanner input = new Scanner(System.in);

		System.out.print("Basamak say�s� giriniz: ");
		n = input.nextInt();
		
		for (int i = n; i >=1; i--) {			
			for (int j = 0; j <=(n-i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=(2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
