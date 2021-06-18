package metotlar;

import java.util.Scanner;

public class recursivePattern {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� Metotlar �dev 3
		// Desene G�re Metot Olu�turma
		//Java dilinde kullan�c�dan al�nan n de�erine g�re a�a��daki kurala uyan d�ng� kullanmadan bir "Recursive" metot yaz�n.

		//Kural : Girilen say� 0 veya negatif oldu�u yere kadar girilen say�dan 5 rakam�n� ��kar�n.
		//Her ��karma i�lemi s�ras�nda ekrana son de�eri yazd�r�n. 
		//Say� negatif veya 0 olduktan sonra tekrar 5 ekleyin. 
		//Yine her ekleme i�leminde say�n�n son de�erini ekrana yazd�r�n.
		
		int n;

		Scanner input = new Scanner(System.in);

		System.out.print("Bir say� giriniz. ");
		n = input.nextInt();
		recursivePattern(n);

	}
	
	static int recursivePattern(int n) {
		System.out.print(" "+n);
        if(n <= 0) {
            return n;
        }
        int temp = recursivePattern(n-5)+5;
        System.out.print(" "+ temp);
        return temp;		
	}

}
