package kosulluifadeler;

import java.util.Scanner;

public class cinZodyagi {
	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� Ko�ullu ifadeler �dev 2
		// �in Zodya�� Hesaplayan Program
		
		/*
		 * �in zodya�� hesaplan�rken ki�inin do�um y�l�n�n 12 ile b�l�m�nden kalana g�re bulunur. 
		 */
		int yil,burc;
		Scanner input = new Scanner(System.in);

		System.out.print("Do�um Y�l�n�z� Giriniz: ");
		yil = input.nextInt();
		
		burc=yil%12;
		if (burc==0) System.out.println("�in Zodya�� Burcunuz: Maymun");
		else if(burc==1) System.out.println("�in Zodya�� Burcunuz: Horoz");
		else if(burc==2) System.out.println("�in Zodya�� Burcunuz: K�pek");
		else if(burc==3) System.out.println("�in Zodya�� Burcunuz: Domuz");
		else if(burc==4) System.out.println("�in Zodya�� Burcunuz: Fare");
		else if(burc==5) System.out.println("�in Zodya�� Burcunuz: �k�z");
		else if(burc==6) System.out.println("�in Zodya�� Burcunuz: Kaplan");
		else if(burc==7) System.out.println("�in Zodya�� Burcunuz: Tav�an");
		else if(burc==8) System.out.println("�in Zodya�� Burcunuz: Ejderha");
		else if(burc==9) System.out.println("�in Zodya�� Burcunuz: Y�lan");
		else if(burc==10) System.out.println("�in Zodya�� Burcunuz: At");
		else if(burc==11) System.out.println("�in Zodya�� Burcunuz: Koyun");

	}
}
