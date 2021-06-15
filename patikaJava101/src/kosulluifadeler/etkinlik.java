package kosulluifadeler;

import java.util.Scanner;

public class etkinlik {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Koþullu ifadeler pratik 4
		// Hava Sýcaklýðýna Göre Etkinlik Öneren Program
		//					Koþullar
		//Sýcaklýk 5'dan küçük ise "Kayak" yapmayý öner.
		//Sýcaklýk 5 ve 15 arasýnda ise "Sinema" etkinliðini öner.
		//Sýcaklýk 10 ve 25 arasýnda ise "Piknik" etkinliðini öner.
		//Sýcaklýk 25'ten büyük ise "Yüzme" etkinliðini öner.		

		int heat;
		Scanner input = new Scanner(System.in);

		System.out.print("Hava sýcaklýðýný giriniz: ");
		heat = input.nextInt();

		if (heat < 5) {
			System.out.println("Kayak");			
			
		} 
		else if(heat>=5 &&heat<=25) {
			if(heat>=5 && heat<=10) System.out.println("Sinema");
			else if(heat>15&& heat<=25) System.out.println("Piknik");
			else System.out.println("SÝnema veya Piknik");
		}
		
		else {
			System.out.println("Yüzme");
		}

	}

}
