package donguler;

import java.util.Scanner;

public class basamakToplam {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� D�ng�ler pratik 6
		// Armstrong Say�lar� Bulan Program
		// Bir say�n�n basamak say�lar�n�n toplam�n� hesaplayan program yaz�n�z.
		
		int n,total=0,numberCounter=0;

		Scanner input = new Scanner(System.in);
		
		System.out.print("Say� giriniz: ");
		n=input.nextInt();
		
		total+=n%10;//birler basama��n� eklendi
		while (n!=0) {//basamak say�s� bulundu
			n/=10;
			numberCounter++;
			total+=n%10;
			
		}
		System.out.println("Toplam: "+total);
		

	}

}
