package temelkavramlar;

import java.util.Scanner;

public class manav {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� Temel kavramlar �dev 2
		// Manav Kasa Program�

		double total,perPear=2.14, perApple=3.67,perTomato=1.11,perBanana=0.95,perEggplant=5.0;
		int pear,apple,tomato,banana,eggplant;

		Scanner input = new Scanner(System.in);

		System.out.print("Armut ka� kilo ? : ");
		pear=input.nextInt();
		
		System.out.print("Elma ka� kilo ? : ");
		apple=input.nextInt();

		System.out.print("Domates ka� kilo ? : ");
		tomato=input.nextInt();

		System.out.print("Muz ka� kilo ? : ");
		banana=input.nextInt();

		System.out.print("Patl�can ka� kilo ? : ");
		eggplant=input.nextInt();

		total=(perApple*apple)+(perBanana*banana)+(perEggplant*eggplant)+(perPear*pear)+(perTomato*tomato);
		System.out.println("Toplam tutar: "+total+" TL");

	}

}
