package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class minMax {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� diziler pratik 2
		// Dizideki Elemanlar�n Max ve Min De�erlerini Bulan Program
		// Dizideki elemanlar�n girilen say�dan k���k en yak�n say�y� ve en b�y�k en
		// yak�n say�y� bulan program� yaz�n�z.

		int[] array = { 15, 12, 788, 1, -1, -778, 2, 0 };
		int n;
		int min = array[0], max = array[0],minDiff=0,maxDiff= Integer.MAX_VALUE;
		
		

		System.out.println(Arrays.toString(array));
		Scanner input = new Scanner(System.in);
		System.out.print("Girilen Say� : ");
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

        System.out.println("Girilen say�dan en k���k en yak�n say�: " + min);
        System.out.println("Girilen say�dan en b�y�k en yak�n say�: " + max);
		
		

	}

}
