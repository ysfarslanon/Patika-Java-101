package kosulluifadeler;

import java.util.Scanner;

public class hesapMakinesi {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� Ko�ullu ifadeler pratik 1
		// Hesap makinesi (switch-case)

		int n1, n2, select;

		Scanner input = new Scanner(System.in);

		System.out.print("Birinci say�y� giriniz: ");
		n1 = input.nextInt();

		System.out.print("�kinci say�y� giriniz: ");
		n2 = input.nextInt();

		System.out.println("1-Toplama\n2-��kartma\n3-�arpma\n4-B�lme");
		System.out.print("Se�im giriniz: ");
		select = input.nextInt();

		switch (select) {
		case 1: {
			System.out.print("Toplam:"+(n1+n2));
			break;
		}
		case 2: {
			System.out.print("��kartma:"+(n1-n2));
			break;
		}
		case 3: {
			System.out.print("�arpma:"+(n1*n2));
			break;
		}
		case 4: {
			
			switch (n2) {
			case 0:
				System.out.print("Bir say� s�f�ra b�l�nemez");
				break;
			default:
				System.out.print("B�lme:"+(n1/n2));
				break;
			}
			break;
		}
		default:
			System.out.println("Yanl�� se�im yapt�n�z.");
			break;
		}
	}

}
