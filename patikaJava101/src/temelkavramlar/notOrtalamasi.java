package temelkavramlar;

import java.util.Scanner;

public class notOrtalamasi {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� Temel kavramlar pratik 1
		// Not ortalamas� hesaplayan program

		int mat, fizik, kimya, turkce, tarih, muzik;

		Scanner input = new Scanner(System.in);

		System.out.print("Matematik notunuzu giriniz: ");
		mat = input.nextInt();

		System.out.print("Fizik notunuzu giriniz: ");
		fizik = input.nextInt();

		System.out.print("Kimya notunuzu giriniz: ");
		kimya = input.nextInt();

		System.out.print("T�rk�e notunuzu giriniz: ");
		turkce = input.nextInt();

		System.out.print("Tarih notunuzu giriniz: ");
		tarih = input.nextInt();

		System.out.print("M�zik notunuzu giriniz: ");
		muzik = input.nextInt();

		double ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6;

		System.out.println(ort > 60 ? "S�n�f� Ge�ti" : "S�n�fta Kald�");

	}

}
