package temelkavramlar;

import java.util.Scanner;

public class kdv {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikası Temel kavramlar pratik 2
		// KDV tutarı hesaplayan program
		
		double tutar,kdvTutari,kdvliTutar,kdv=0.18;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ücreti giriniz: ");
		tutar=input.nextDouble();
		
		kdv=(tutar>=0&&tutar<=1000?0.18:0.08);
		
		kdvTutari=tutar*kdv;
		kdvliTutar=tutar+kdvTutari;
		
		System.out.println("KDV'siz Fiyat:"+tutar);
		System.out.println("KDV'li Fiyat:"+kdvliTutar);
		System.out.println("KDV tutarı:"+kdvTutari);
		
	}

}
