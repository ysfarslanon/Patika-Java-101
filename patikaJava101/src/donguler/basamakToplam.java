package donguler;

import java.util.Scanner;

public class basamakToplam {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Döngüler pratik 6
		// Armstrong Sayýlarý Bulan Program
		// Bir sayýnýn basamak sayýlarýnýn toplamýný hesaplayan program yazýnýz.
		
		int n,total=0,numberCounter=0;

		Scanner input = new Scanner(System.in);
		
		System.out.print("Sayý giriniz: ");
		n=input.nextInt();
		
		total+=n%10;//birler basamaðýný eklendi
		while (n!=0) {//basamak sayýsý bulundu
			n/=10;
			numberCounter++;
			total+=n%10;
			
		}
		System.out.println("Toplam: "+total);
		

	}

}
