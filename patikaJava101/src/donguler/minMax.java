package donguler;

import java.util.Scanner;

public class minMax {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� D�ng�ler �dev 1
		//Girilen Say�lardan Min ve Max De�erli Bulan Program
		
		int n, min = Integer.MAX_VALUE,max=0,number;

		Scanner input = new Scanner(System.in);

		System.out.print("Ka� tane say� gireceksiniz: ");
		n = input.nextInt();
		
		for (int i = 1; i <=n; i++) {
			System.out.print(i+". Say�y� giriniz: ");
			number=input.nextInt();
			if (number>max) 
				max=number;			
			if(number < min) 
				min = number;		
		}
		
		System.out.println("En b�y�k say�: "+max);
		System.out.println("En k���k say�: "+min);		

	}

}
