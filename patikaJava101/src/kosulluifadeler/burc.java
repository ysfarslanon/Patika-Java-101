package kosulluifadeler;

import java.util.Scanner;

public class burc {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikası Koşullu ifadeler pratik 6
		// Burc Bulan Program
		// Sadece if-else yapısı kullanılacak

		int month, day;
		Scanner input = new Scanner(System.in);

		System.out.print("Ayı(sayı)  giriniz: ");
		month = input.nextInt();

		System.out.print("Günü(sayı) giriniz: ");
		day = input.nextInt();

		if (month == 1) {//Ocak
			if(day>=1&&day<=21)System.out.println("Oğlak");
			else if(day>21&& day<=31) System.out.println("Kova");
			else System.out.println("Uygun bir gün girilmedi");
		}else if (month == 2) {//Şubat
			if(day>=1&&day<=19)System.out.println("Kova");
			else if(day>19&& day<=28) System.out.println("Balık");
			else System.out.println("Uygun bir gün girilmedi");
		}else if (month == 3) {//Mart
			if(day>=1&&day<=20)System.out.println("Balık");
			else if(day>20&& day<=31) System.out.println("Koç");
			else System.out.println("Uygun bir gün girilmedi");
		}else if (month == 4) {//Nisan
			if(day>=1&&day<=20)System.out.println("Koç");
			else if(day>20&& day<=30) System.out.println("Boğa");
			else System.out.println("Uygun bir gün girilmedi");
		}else if (month == 5) {//Mayıs
			if(day>=1&&day<=21)System.out.println("Boğa");
			else if(day>21&& day<=31) System.out.println("İkizler");
			else System.out.println("Uygun bir gün girilmedi");
		}else if (month == 6) {//Haziran
			if(day>=1&&day<=22)System.out.println("İkizler");
			else if(day>22&& day<=30) System.out.println("Yengeç");
			else System.out.println("Uygun bir gün girilmedi");
		}else if (month == 7) {//Temmuz
			if(day>=1&&day<=22)System.out.println("Yengeç");
			else if(day>22&& day<=31) System.out.println("Aslan");
			else System.out.println("Uygun bir gün girilmedi");
		}else if (month == 8) {//Ağustos
			if(day>=1&&day<=22)System.out.println("Aslan");
			else if(day>22&& day<=30) System.out.println("Başak");
			else System.out.println("Uygun bir gün girilmedi");
		}else if (month == 9) {//Eylül
			if(day>=1&&day<=22)System.out.println("Başak");
			else if(day>22&& day<=31) System.out.println("Terazi");
			else System.out.println("Uygun bir gün girilmedi");
		}else if (month == 10) {//Ekim
			if(day>=1&&day<=22)System.out.println("Terazi");
			else if(day>22&& day<=30) System.out.println("Akrep");
			else System.out.println("Uygun bir gün girilmedi");
		}else if (month == 11) {//Kasım
			if(day>=1&&day<=21)System.out.println("Akrep");
			else if(day>21&& day<=31) System.out.println("Yay");
			else System.out.println("Uygun bir gün girilmedi");
		}else if (month == 12) {//Aralık
			if(day>=1&&day<=21)System.out.println("Yay");
			else if(day>21&& day<=31) System.out.println("Oğlak");
			else System.out.println("Uygun bir gün girilmedi");
		}
		else System.out.println("Uygun bir ay girilmedi.");

	}

}
