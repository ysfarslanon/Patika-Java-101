package temelkavramlar;

import java.util.Scanner;

public class taksi {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Temel kavramlar pratik 4
		// Taksimetre hesaplayan program
		
		int km;
		double total=10.0,perKm=2.20;
		
		Scanner input =new Scanner(System.in);
		
		System.out.print("Mesafe(KM) giriniz: ");
		km=input.nextInt();
		
		total+=km*perKm;
		total=(total<20)?20:total;
		
		System.out.print("Toplam tutar: "+total+" TL");
		
	}

}
