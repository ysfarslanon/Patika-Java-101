package kosulluifadeler;

import java.util.Scanner;

public class sinifGecme {
	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Koþullu ifadeler pratik 3
		// Sýnýf Geçme Durumu

		int mat,fizik,turkce,kimya,muzik,total;
		double ortalama;

		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik notunuz: ");
		mat=input.nextInt();
		mat=(mat<0||mat>100)?0:mat;
		
		System.out.print("Fizik notunuz: ");
		fizik=input.nextInt();
		fizik=(fizik<0||fizik>100)?0:fizik;
		
		System.out.print("Türkçe notunuz: ");
		turkce=input.nextInt();
		turkce=(turkce<0||turkce>100)?0:turkce;
		
		System.out.print("Kimya notunuz: ");
		kimya=input.nextInt();
		kimya=(kimya<0||kimya>100)?0:kimya;
		
		System.out.print("Müzik notunuz: ");
		muzik=input.nextInt();
		muzik=(muzik<0||muzik>100)?0:muzik;
		
		ortalama=(mat+fizik+kimya+muzik+turkce)/5;
		
		System.out.println("Ortalamanýz: "+ortalama);
		System.out.println((ortalama>55)?"Tebrikler!! Sýnýfý geçtiniz.":"Üzgünüz... Sýnýfta kaldýnýz. ");
		
		
		
	}
}
