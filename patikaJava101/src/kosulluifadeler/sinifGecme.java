package kosulluifadeler;

import java.util.Scanner;

public class sinifGecme {
	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� Ko�ullu ifadeler pratik 3
		// S�n�f Ge�me Durumu

		int mat,fizik,turkce,kimya,muzik,total;
		double ortalama;

		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik notunuz: ");
		mat=input.nextInt();
		mat=(mat<0||mat>100)?0:mat;
		
		System.out.print("Fizik notunuz: ");
		fizik=input.nextInt();
		fizik=(fizik<0||fizik>100)?0:fizik;
		
		System.out.print("T�rk�e notunuz: ");
		turkce=input.nextInt();
		turkce=(turkce<0||turkce>100)?0:turkce;
		
		System.out.print("Kimya notunuz: ");
		kimya=input.nextInt();
		kimya=(kimya<0||kimya>100)?0:kimya;
		
		System.out.print("M�zik notunuz: ");
		muzik=input.nextInt();
		muzik=(muzik<0||muzik>100)?0:muzik;
		
		ortalama=(mat+fizik+kimya+muzik+turkce)/5;
		
		System.out.println("Ortalaman�z: "+ortalama);
		System.out.println((ortalama>55)?"Tebrikler!! S�n�f� ge�tiniz.":"�zg�n�z... S�n�fta kald�n�z. ");
		
		
		
	}
}
