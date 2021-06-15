package kosulluifadeler;

import java.util.Scanner;

public class kullaniciGirisi {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Koþullu ifadeler pratik 2
		// Kullanýcý giriþi

		String userName, password, select;

		Scanner input = new Scanner(System.in);

		System.out.print("Kullanýcý adýnýz: ");
		userName = input.nextLine();

		System.out.print("Þifreniz: ");
		password = input.nextLine();

		if (userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giriþ Yaptýnýz.");

		} else {
			System.out.println("Bilgileriniz Yanlýþ.");
			System.out.println("Þifre sýfýrlamak ister misiniz?\nEvet-Hayýr");
			select = input.nextLine();
			if (select.equals("Evet") || select.equals("evet")) {
				System.out.print("Yeni þifre giriniz.");
				password = input.nextLine();
				if (password.equals("java123")) {
					System.out.println("Önceki þifre olamaz.");
				} else {
					System.out.println("Þifre oluþturuldu");
				}
			} else {
				System.out.println("Sistemden çýkýlýyor.");
				System.exit(0);
			}

		}
	}

}
