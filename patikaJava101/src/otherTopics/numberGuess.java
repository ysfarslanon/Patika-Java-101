package otherTopics;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class numberGuess {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý diðer konular pratik 1
		// Sayý Tahmin Oyunu
		// Java dilinde programýn 0-100 arasýnda rastgele seçtiði bir sayýyý
		// kullanýcýnýn tahmin etmesini istediðimiz bir "Sayý Tahmin Oyunu" yapýyoruz.

		// int number=(int)(Math.random()*100);

		  Random rand = new Random();
	        int number = rand.nextInt(100);
	        //int number = (int) (Math.random() * 100);

	        Scanner input = new Scanner(System.in);
	        int right = 0;
	        int selected;
	        int[] wrong = new int[5];
	        boolean isWin = false;
	        boolean isWrong = false;

	        System.out.println(number);
	        while (right < 5) {
	            System.out.print("\nLütfen tahmininizi giriniz : ");
	            selected = input.nextInt();

	            if (selected < 0 || selected > 99) {
	                System.out.println("\nLütfen 0-100 arasýnda bir deðer giriniz.");
	                if (isWrong) {
	                    right++;
	                    System.out.println("Çok fazla hatalý giriþ yaptýnýz. Kalan hak : " + (5 - right));
	                } else {
	                    isWrong = true;
	                    System.out.println("Bir daha hatalý giriþinizde hakkýnýzdan düþülecektir.");
	                }
	                continue;
	            }

	            if (selected == number) {
	                System.out.println("Tebrikler, doðru tahmin ! Tahmin ettiðini sayý : " + number);
	                isWin = true;
	                break;
	            } else {
	                System.out.println("\nHatalý bir sayý girdiniz !");
	                if (selected > number) {
	                    System.out.println(selected + " sayýsý, gizli sayýdan büyüktür.");
	                } else {
	                    System.out.println(selected + " sayýsý, gizli sayýdan küçüktür.");
	                }

	                wrong[right++] = selected;
	                System.out.println("Kalan hakký : " + (5 - right));
	            }
	        }

	        if (!isWin) {
	            System.out.println("Kaybettiniz ! ");
	            if (!isWrong) {
	                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
	            }
	        }

	    }

}
