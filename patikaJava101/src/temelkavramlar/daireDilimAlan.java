package temelkavramlar;

import java.util.Scanner;

public class daireDilimAlan {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Temel kavramlar pratik 5
		// Daire dilim alaný
		
		int r,centerAngle;
		double field,pi=3.14;
		
		Scanner input =new Scanner(System.in);
		
		System.out.print("Yarýçapý giriniz: ");
		r=input.nextInt();
		
		System.out.print("Merkez açýyý giriniz: ");
		centerAngle=input.nextInt();
		
		field=(pi*(r*r)*centerAngle)/360;
		System.out.println("Daire diliminin alaný: "+field);
		
		

	}

}
