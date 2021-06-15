package kosulluifadeler;

import java.util.Scanner;

public class ucakBilet {
	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Koþullu ifadeler ödev 1
		// Uçak Bileti Fiyatý Hesaplayan Program		
		
		/*
		 *
		 * Java ile mesafeye ve þartlara göre uçak bileti fiyatý hesaplayan programý
		 * yapýn. Kullanýcýdan Mesafe (KM), yaþý ve yolculuk tipi (Tek Yön, Gidiþ-Dönüþ)
		 * bilgilerini alýn. Mesafe baþýna ücret 0,10 TL / km olarak alýn. Ýlk olarak
		 * uçuþun toplam fiyatýný hesaplayýn ve sonrasýnda ki koþullara göre müþteriye
		 * aþaðýdaki indirimleri uygulayýn ;
		 * 
		 * Kullanýcýdan alýnan deðerler geçerli (mesafe ve yaþ deðerleri pozitif sayý,
		 * yolculuk tipi ise 1 veya 2) olmalýdýr. Aksi takdirde kullanýcýya
		 * "Hatalý Veri Girdiniz !" þeklinde bir uyarý verilmelidir.
		 * Kiþi 12 yaþýndan küçükse bilet fiyatý üzerinden %50 indirim uygulanýr.
		 * Kiþi 12-24 yaþlarý arasýnda ise bilet fiyatý üzerinden %10 indirim uygulanýr.
		 * Kiþi 65 yaþýndan büyük ise bilet fiyatý üzerinden %30 indirim uygulanýr. 
		 * Kiþi "Yolculuk Tipini" gidiþ dönüþ seçmiþ ise bilet fiyatý üzerinden %20 indirim uygulanýr.
		 * 
		 */
		int km, yas, yolculukTipi;
		double normalUcret = 0, indirimliTutar = 0, total, yasIndirim, yolculukTipiIndirim;
		Scanner input = new Scanner(System.in);

		System.out.print("Mesafeyi KM türünde giriniz: ");
		km = input.nextInt();

		System.out.print("Yaþýnýzý giriniz: ");
		yas = input.nextInt();

		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiþ Dönüþ): ");
		yolculukTipi = input.nextInt();

		if (km < 0 || yas < 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
			System.out.println("Hatalý Veri Girdiniz !");
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
