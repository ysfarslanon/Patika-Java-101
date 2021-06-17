package donguler;

import java.util.Scanner;

public class harmonik {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Döngüler pratik 7
		// Harmonik Sayýlarý Bulan Program
		// Java ile girilen sayýnýn harmonik serisini bulan program yazacaðýz.
		
		double n,result=0;

		Scanner input = new Scanner(System.in);
		
		System.out.print("Sayý giriniz: ");
		n=input.nextDouble();
		
		while (n>0) {
			result+=(1/n);
			n--;
		}
		
		System.out.print(result);

	}

}
