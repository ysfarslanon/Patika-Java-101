package kosulluifadeler;

import java.util.Scanner;

public class burc {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� Ko�ullu ifadeler pratik 6
		// Burc Bulan Program
		// Sadece if-else yap�s� kullan�lacak

		int month, day;
		Scanner input = new Scanner(System.in);

		System.out.print("Ay�(say�)  giriniz: ");
		month = input.nextInt();

		System.out.print("G�n�(say�) giriniz: ");
		day = input.nextInt();

		if (month == 1) {//Ocak
			if(day>=1&&day<=21)System.out.println("O�lak");
			else if(day>21&& day<=31) System.out.println("Kova");
			else System.out.println("Uygun bir g�n girilmedi");
		}else if (month == 2) {//�ubat
			if(day>=1&&day<=19)System.out.println("Kova");
			else if(day>19&& day<=28) System.out.println("Bal�k");
			else System.out.println("Uygun bir g�n girilmedi");
		}else if (month == 3) {//Mart
			if(day>=1&&day<=20)System.out.println("Bal�k");
			else if(day>20&& day<=31) System.out.println("Ko�");
			else System.out.println("Uygun bir g�n girilmedi");
		}else if (month == 4) {//Nisan
			if(day>=1&&day<=20)System.out.println("Ko�");
			else if(day>20&& day<=30) System.out.println("Bo�a");
			else System.out.println("Uygun bir g�n girilmedi");
		}else if (month == 5) {//May�s
			if(day>=1&&day<=21)System.out.println("Bo�a");
			else if(day>21&& day<=31) System.out.println("�kizler");
			else System.out.println("Uygun bir g�n girilmedi");
		}else if (month == 6) {//Haziran
			if(day>=1&&day<=22)System.out.println("�kizler");
			else if(day>22&& day<=30) System.out.println("Yenge�");
			else System.out.println("Uygun bir g�n girilmedi");
		}else if (month == 7) {//Temmuz
			if(day>=1&&day<=22)System.out.println("Yenge�");
			else if(day>22&& day<=31) System.out.println("Aslan");
			else System.out.println("Uygun bir g�n girilmedi");
		}else if (month == 8) {//A�ustos
			if(day>=1&&day<=22)System.out.println("Aslan");
			else if(day>22&& day<=30) System.out.println("Ba�ak");
			else System.out.println("Uygun bir g�n girilmedi");
		}else if (month == 9) {//Eyl�l
			if(day>=1&&day<=22)System.out.println("Ba�ak");
			else if(day>22&& day<=31) System.out.println("Terazi");
			else System.out.println("Uygun bir g�n girilmedi");
		}else if (month == 10) {//Ekim
			if(day>=1&&day<=22)System.out.println("Terazi");
			else if(day>22&& day<=30) System.out.println("Akrep");
			else System.out.println("Uygun bir g�n girilmedi");
		}else if (month == 11) {//Kas�m
			if(day>=1&&day<=21)System.out.println("Akrep");
			else if(day>21&& day<=31) System.out.println("Yay");
			else System.out.println("Uygun bir g�n girilmedi");
		}else if (month == 12) {//Aral�k
			if(day>=1&&day<=21)System.out.println("Yay");
			else if(day>21&& day<=31) System.out.println("O�lak");
			else System.out.println("Uygun bir g�n girilmedi");
		}
		else System.out.println("Uygun bir ay girilmedi.");

	}

}
