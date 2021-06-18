package metotlar;

import java.util.Scanner;

public class recursivePrimeNumber {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� Metotlar �dev 2
		// Recursive Metot ile Asal Say�lar

		int n;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir say� giriniz. ");
		n=input.nextInt();
		
		if (isPrime(n,n-1)) 
			System.out.println(n+" say�s� ASALDIR !");
		 else 
			System.out.println(n+" say�s� ASAL de�ildir !");
		

	}

	static boolean isPrime(int number,int temp) {
		
		if(temp==1) 
			return true;
		else if (number%temp==0)
			return false;
		
		return isPrime(number,temp-1);
	}

}
