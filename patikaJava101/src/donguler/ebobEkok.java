package donguler;

import java.util.Scanner;

public class ebobEkok {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� D�ng�ler pratik 10
		// Pratik - EBOB-EKOK Bulan Program
		// Java ile iki say�n�n EBOB ve EKOK de�erlerini "While D�ng�s�" kullanarak yaz�n�z.

		int n1,n2,smallNumber,bigNumber;
		int ebob=1,ekok=1,k=1;

		Scanner input = new Scanner(System.in);

		System.out.print("Birinci say�y� giriniz: ");
		n1 = input.nextInt();
		System.out.print("�kinci say�y� giriniz: ");
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
