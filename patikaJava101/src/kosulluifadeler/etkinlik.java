package kosulluifadeler;

import java.util.Scanner;

public class etkinlik {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� Ko�ullu ifadeler pratik 4
		// Hava S�cakl���na G�re Etkinlik �neren Program
		//					Ko�ullar
		//S�cakl�k 5'dan k���k ise "Kayak" yapmay� �ner.
		//S�cakl�k 5 ve 15 aras�nda ise "Sinema" etkinli�ini �ner.
		//S�cakl�k 10 ve 25 aras�nda ise "Piknik" etkinli�ini �ner.
		//S�cakl�k 25'ten b�y�k ise "Y�zme" etkinli�ini �ner.		

		int heat;
		Scanner input = new Scanner(System.in);

		System.out.print("Hava s�cakl���n� giriniz: ");
		heat = input.nextInt();

		if (heat < 5) {
			System.out.println("Kayak");			
			
		} 
		else if(heat>=5 &&heat<=25) {
			if(heat>=5 && heat<=10) System.out.println("Sinema");
			else if(heat>15&& heat<=25) System.out.println("Piknik");
			else System.out.println("S�nema veya Piknik");
		}
		
		else {
			System.out.println("Y�zme");
		}

	}

}
