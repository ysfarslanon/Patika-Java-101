package kosulluifadeler;

import java.util.Scanner;

public class hesapMakinesi {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Koþullu ifadeler pratik 1
		// Hesap makinesi (switch-case)

		int n1, n2, select;

		Scanner input = new Scanner(System.in);

		System.out.print("Birinci sayýyý giriniz: ");
		n1 = input.nextInt();

		System.out.print("Ýkinci sayýyý giriniz: ");
		n2 = input.nextInt();

		System.out.println("1-Toplama\n2-Çýkartma\n3-Çarpma\n4-Bölme");
		System.out.print("Seçim giriniz: ");
		select = input.nextInt();

		switch (select) {
		case 1: {
			System.out.print("Toplam:"+(n1+n2));
			break;
		}
		case 2: {
			System.out.print("Çýkartma:"+(n1-n2));
			break;
		}
		case 3: {
			System.out.print("Çarpma:"+(n1*n2));
			break;
		}
		case 4: {
			
			switch (n2) {
			case 0:
				System.out.print("Bir sayý sýfýra bölünemez");
				break;
			default:
				System.out.print("Bölme:"+(n1/n2));
				break;
			}
			break;
		}
		default:
			System.out.println("Yanlýþ seçim yaptýnýz.");
			break;
		}
	}

}
