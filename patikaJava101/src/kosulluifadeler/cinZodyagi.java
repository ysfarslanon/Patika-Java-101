package kosulluifadeler;

import java.util.Scanner;

public class cinZodyagi {
	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Koþullu ifadeler ödev 2
		// Çin Zodyaðý Hesaplayan Program
		
		/*
		 * Çin zodyaðý hesaplanýrken kiþinin doðum yýlýnýn 12 ile bölümünden kalana göre bulunur. 
		 */
		int yil,burc;
		Scanner input = new Scanner(System.in);

		System.out.print("Doðum Yýlýnýzý Giriniz: ");
		yil = input.nextInt();
		
		burc=yil%12;
		if (burc==0) System.out.println("Çin Zodyaðý Burcunuz: Maymun");
		else if(burc==1) System.out.println("Çin Zodyaðý Burcunuz: Horoz");
		else if(burc==2) System.out.println("Çin Zodyaðý Burcunuz: Köpek");
		else if(burc==3) System.out.println("Çin Zodyaðý Burcunuz: Domuz");
		else if(burc==4) System.out.println("Çin Zodyaðý Burcunuz: Fare");
		else if(burc==5) System.out.println("Çin Zodyaðý Burcunuz: Öküz");
		else if(burc==6) System.out.println("Çin Zodyaðý Burcunuz: Kaplan");
		else if(burc==7) System.out.println("Çin Zodyaðý Burcunuz: Tavþan");
		else if(burc==8) System.out.println("Çin Zodyaðý Burcunuz: Ejderha");
		else if(burc==9) System.out.println("Çin Zodyaðý Burcunuz: Yýlan");
		else if(burc==10) System.out.println("Çin Zodyaðý Burcunuz: At");
		else if(burc==11) System.out.println("Çin Zodyaðý Burcunuz: Koyun");

	}
}
