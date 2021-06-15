package kosulluifadeler;

import java.util.Scanner;

public class ucakBilet {
	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� Ko�ullu ifadeler �dev 1
		// U�ak Bileti Fiyat� Hesaplayan Program		
		
		/*
		 *
		 * Java ile mesafeye ve �artlara g�re u�ak bileti fiyat� hesaplayan program�
		 * yap�n. Kullan�c�dan Mesafe (KM), ya�� ve yolculuk tipi (Tek Y�n, Gidi�-D�n��)
		 * bilgilerini al�n. Mesafe ba��na �cret 0,10 TL / km olarak al�n. �lk olarak
		 * u�u�un toplam fiyat�n� hesaplay�n ve sonras�nda ki ko�ullara g�re m��teriye
		 * a�a��daki indirimleri uygulay�n ;
		 * 
		 * Kullan�c�dan al�nan de�erler ge�erli (mesafe ve ya� de�erleri pozitif say�,
		 * yolculuk tipi ise 1 veya 2) olmal�d�r. Aksi takdirde kullan�c�ya
		 * "Hatal� Veri Girdiniz !" �eklinde bir uyar� verilmelidir.
		 * Ki�i 12 ya��ndan k���kse bilet fiyat� �zerinden %50 indirim uygulan�r.
		 * Ki�i 12-24 ya�lar� aras�nda ise bilet fiyat� �zerinden %10 indirim uygulan�r.
		 * Ki�i 65 ya��ndan b�y�k ise bilet fiyat� �zerinden %30 indirim uygulan�r. 
		 * Ki�i "Yolculuk Tipini" gidi� d�n�� se�mi� ise bilet fiyat� �zerinden %20 indirim uygulan�r.
		 * 
		 */
		int km, yas, yolculukTipi;
		double normalUcret = 0, indirimliTutar = 0, total, yasIndirim, yolculukTipiIndirim;
		Scanner input = new Scanner(System.in);

		System.out.print("Mesafeyi KM t�r�nde giriniz: ");
		km = input.nextInt();

		System.out.print("Ya��n�z� giriniz: ");
		yas = input.nextInt();

		System.out.print("Yolculuk tipini giriniz (1 => Tek Y�n , 2 => Gidi� D�n��): ");
		yolculukTipi = input.nextInt();

		if (km < 0 || yas < 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
			System.out.println("Hatal� Veri Girdiniz !");
		} else {
			normalUcret = km * 0.10;
			if (yas < 12) {
				yasIndirim = (normalUcret * 0.50);
				indirimliTutar = normalUcret - yasIndirim;
			} else if (yas >= 12 && yas <= 24) {
				yasIndirim = (normalUcret * 0.10);
				indirimliTutar = normalUcret - yasIndirim;
			} else if (yas > 65) {
				yasIndirim = (normalUcret * 0.3);
				indirimliTutar = normalUcret - yasIndirim;
			}

			if (yolculukTipi == 2) {
				yolculukTipiIndirim = (indirimliTutar * 0.2);
				indirimliTutar -= yolculukTipiIndirim;
				total = indirimliTutar * 2;
			} else {
				total = normalUcret;
			}

			System.out.println("\n\nToplam Tutar: " + total + " TL");
		}

	}
}
