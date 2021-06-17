package donguler;

import java.util.Scanner;

public class ebobEkok {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Döngüler pratik 10
		// Pratik - EBOB-EKOK Bulan Program
		// Java ile iki sayýnýn EBOB ve EKOK deðerlerini "While Döngüsü" kullanarak yazýnýz.

		int n1,n2,smallNumber,bigNumber;
		int ebob=1,ekok=1,k=1;

		Scanner input = new Scanner(System.in);

		System.out.print("Birinci sayýyý giriniz: ");
		n1 = input.nextInt();
		System.out.print("Ýkinci sayýyý giriniz: ");
		n2 = input.nextInt();

		if (n1<n2) {
			smallNumber=n1;
			bigNumber=n2;
		} else {
			smallNumber=n2;
			bigNumber=n1;
		}
		while (k<=smallNumber) {
			if (n1%k==0&&n2%k==0) {
				ebob=k;
			}
			k++;			
		}
		ekok=(n1*n2)/ebob;
		
		System.out.println("EBOB: "+ebob+" EKOK:"+ekok);
		

	}

}
