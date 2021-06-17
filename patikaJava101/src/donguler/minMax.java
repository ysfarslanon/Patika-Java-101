package donguler;

import java.util.Scanner;

public class minMax {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Döngüler ödev 1
		//Girilen Sayýlardan Min ve Max Deðerli Bulan Program
		
		int n, min = Integer.MAX_VALUE,max=0,number;

		Scanner input = new Scanner(System.in);

		System.out.print("Kaç tane sayý gireceksiniz: ");
		n = input.nextInt();
		
		for (int i = 1; i <=n; i++) {
			System.out.print(i+". Sayýyý giriniz: ");
			number=input.nextInt();
			if (number>max) 
				max=number;			
			if(number < min) 
				min = number;		
		}
		
		System.out.println("En büyük sayý: "+max);
		System.out.println("En küçük sayý: "+min);		

	}

}
