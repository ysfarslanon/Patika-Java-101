package donguler;


import java.util.Scanner;

public class diamondStar {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� D�ng�ler pratik 8
		// Y�ld�zlar ile ��gen Yap�m�
		// Java'da d�ng�ler kullanarak y�ld�zlar ile elmas yap�n�z.

		int n, result = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Say� giriniz: ");
		n = input.nextInt();
		
		//�st ��gen
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=(n-i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=(2*i)-1; j++) {
				System.out.print("*");
			}		
			System.out.println();
		}
		//alt ��gen
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <=(n-i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=(2*i)-1; j++) {
				System.out.print("*");
			}		
			System.out.println();
		}
		

	}

}
