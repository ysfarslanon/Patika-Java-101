package classes.boxingMatch;

public class Main {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Sýnýflar pratik 2
		// Boks Maçý

		Fighter muhammedAli = new Fighter("Marc", 15, 100, 90, 10);
		Fighter mikeTyson = new Fighter("Alex", 10, 195, 100, 20);
		Ring r = new Ring(muhammedAli, mikeTyson, 90, 100);
		r.run();

	}

}
