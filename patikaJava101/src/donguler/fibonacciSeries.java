package donguler;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Döngüler ödev 5
		// Fibonacci Serisi Bulan Program
		// Fibonacci serisi, her sayýnýn kendinden önceki ile toplanmasý sonucu oluþan
		// bir sayý dizisidir.
		// Fibonacci dizisi, 0'dan baþlar ve sonsuza kadar. Her rakam, bir önceki
		// rakamla toplanýr.
		// Elde edilen sonuç rakamýn sað tarafýna yazýlýr.
		// 0-1-1-2-3-5-8-13-21-34-55-...

		int n,f0=0,f1=1,f;
		Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayýsýný giriniz: ");
        n = input.nextInt();
        
        System.out.print(n + " elemanlý fibonacci serisi: ");
        
        for (int i = 0; i <= n; i++){
            System.out.print(f0+" ");
            f = f0+f1;
            f1 = f0;
            f0= f;
        }

	}

}
