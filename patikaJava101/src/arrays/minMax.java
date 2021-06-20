package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class minMax {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý diziler pratik 2
		// Dizideki Elemanlarýn Max ve Min Deðerlerini Bulan Program
		// Dizideki elemanlarýn girilen sayýdan küçük en yakýn sayýyý ve en büyük en
		// yakýn sayýyý bulan programý yazýnýz.

		int[] array = { 15, 12, 788, 1, -1, -778, 2, 0 };
		int n;
		int min = array[0], max = array[0],minDiff=0,maxDiff= Integer.MAX_VALUE;
		
		

		System.out.println(Arrays.toString(array));
		Scanner input = new Scanner(System.in);
		System.out.print("Girilen Sayý : ");
		n = input.nextInt();
		

        for (int i = 0; i < array.length; i++){
            int temp;
            if(array[i] > n){
                temp = maxDiff;
                maxDiff = array[i] - n;
                if(maxDiff < temp)max = array[i];
            }else{
                temp = minDiff;
                minDiff = n - array[i];
                if(minDiff < temp) min = array[i];
            }
        }

        System.out.println("Girilen sayýdan en küçük en yakýn sayý: " + min);
        System.out.println("Girilen sayýdan en büyük en yakýn sayý: " + max);
		
		

	}

}
