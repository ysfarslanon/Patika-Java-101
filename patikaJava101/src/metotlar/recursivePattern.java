package metotlar;

import java.util.Scanner;

public class recursivePattern {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Metotlar ödev 3
		// Desene Göre Metot Oluþturma
		//Java dilinde kullanýcýdan alýnan n deðerine göre aþaðýdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazýn.

		//Kural : Girilen sayý 0 veya negatif olduðu yere kadar girilen sayýdan 5 rakamýný çýkarýn.
		//Her çýkarma iþlemi sýrasýnda ekrana son deðeri yazdýrýn. 
		//Sayý negatif veya 0 olduktan sonra tekrar 5 ekleyin. 
		//Yine her ekleme iþleminde sayýnýn son deðerini ekrana yazdýrýn.
		
		int n;

		Scanner input = new Scanner(System.in);

		System.out.print("Bir sayý giriniz. ");
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
