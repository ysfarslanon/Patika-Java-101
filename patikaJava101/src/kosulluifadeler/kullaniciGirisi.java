package kosulluifadeler;

import java.util.Scanner;

public class kullaniciGirisi {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� Ko�ullu ifadeler pratik 2
		// Kullan�c� giri�i

		String userName, password, select;

		Scanner input = new Scanner(System.in);

		System.out.print("Kullan�c� ad�n�z: ");
		userName = input.nextLine();

		System.out.print("�ifreniz: ");
		password = input.nextLine();

		if (userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giri� Yapt�n�z.");

		} else {
			System.out.println("Bilgileriniz Yanl��.");
			System.out.println("�ifre s�f�rlamak ister misiniz?\nEvet-Hay�r");
			select = input.nextLine();
			if (select.equals("Evet") || select.equals("evet")) {
				System.out.print("Yeni �ifre giriniz.");
				password = input.nextLine();
				if (password.equals("java123")) {
					System.out.println("�nceki �ifre olamaz.");
				} else {
					System.out.println("�ifre olu�turuldu");
				}
			} else {
				System.out.println("Sistemden ��k�l�yor.");
				System.exit(0);
			}

		}
	}

}
