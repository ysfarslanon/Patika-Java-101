package temelkavramlar;

import java.util.Scanner;

public class manav {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Temel kavramlar ödev 2
		// Manav Kasa Programý

		double total,perPear=2.14, perApple=3.67,perTomato=1.11,perBanana=0.95,perEggplant=5.0;
		int pear,apple,tomato,banana,eggplant;

		Scanner input = new Scanner(System.in);

		System.out.print("Armut kaç kilo ? : ");
		pear=input.nextInt();
		
		System.out.print("Elma kaç kilo ? : ");
		apple=input.nextInt();

		System.out.print("Domates kaç kilo ? : ");
		tomato=input.nextInt();

		System.out.print("Muz kaç kilo ? : ");
		banana=input.nextInt();

		System.out.print("Patlýcan kaç kilo ? : ");
		eggplant=input.nextInt();

		total=(perApple*apple)+(perBanana*banana)+(perEggplant*eggplant)+(perPear*pear)+(perTomato*tomato);
		System.out.println("Toplam tutar: "+total+" TL");

	}

}
