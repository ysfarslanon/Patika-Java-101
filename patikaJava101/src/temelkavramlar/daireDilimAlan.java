package temelkavramlar;

import java.util.Scanner;

public class daireDilimAlan {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� Temel kavramlar pratik 5
		// Daire dilim alan�
		
		int r,centerAngle;
		double field,pi=3.14;
		
		Scanner input =new Scanner(System.in);
		
		System.out.print("Yar��ap� giriniz: ");
		r=input.nextInt();
		
		System.out.print("Merkez a��y� giriniz: ");
		centerAngle=input.nextInt();
		
		field=(pi*(r*r)*centerAngle)/360;
		System.out.println("Daire diliminin alan�: "+field);
		
		

	}

}
