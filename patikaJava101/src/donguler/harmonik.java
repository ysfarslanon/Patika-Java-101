package donguler;

import java.util.Scanner;

public class harmonik {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� D�ng�ler pratik 6
		// Armstrong Say�lar� Bulan Program
		// BJava ile girilen say�n�n harmonik serisini bulan program yazaca��z.
		
		double n,result=0;

		Scanner input = new Scanner(System.in);
		
		System.out.print("Say� giriniz: ");
		n=input.nextDouble();
		
		while (n>0) {
			result+=(1/n);
			n--;
		}
		
		System.out.print(result);

	}

}
