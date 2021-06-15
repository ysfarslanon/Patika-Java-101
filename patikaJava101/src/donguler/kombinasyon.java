package donguler;

import java.util.Scanner;

public class kombinasyon {
	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Döngüler pratik 4
		// Kombinasyon Bulan Program
		
		int n,r,totaln=1,totalr=1,totalnr=1;

		Scanner input = new Scanner(System.in);
		
		System.out.print("n giriniz: ");
		n=input.nextInt();
		System.out.print("r giriniz: ");
		r=input.nextInt();
		
		for (int i = 1; i <=n; i++) {
			totaln*=i;
		}		
		for (int i = 1; i <=r; i++) {
			totalr*=i;
		}
		for (int i = 1; i <=n-r; i++) {
			totalnr*=i;
		}
		
		int combination=totaln/(totalr*totalnr);
		System.out.println("Kombinasyon: " +combination);
		
	}
}
