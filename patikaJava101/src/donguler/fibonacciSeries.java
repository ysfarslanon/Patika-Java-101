package donguler;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� D�ng�ler �dev 5
		// Fibonacci Serisi Bulan Program
		// Fibonacci serisi, her say�n�n kendinden �nceki ile toplanmas� sonucu olu�an
		// bir say� dizisidir.
		// Fibonacci dizisi, 0'dan ba�lar ve sonsuza kadar. Her rakam, bir �nceki
		// rakamla toplan�r.
		// Elde edilen sonu� rakam�n sa� taraf�na yaz�l�r.
		// 0-1-1-2-3-5-8-13-21-34-55-...

		int n,f0=0,f1=1,f;
		Scanner input = new Scanner(System.in);
        System.out.print("Eleman say�s�n� giriniz: ");
        n = input.nextInt();
        
        System.out.print(n + " elemanl� fibonacci serisi: ");
        
        for (int i = 0; i <= n; i++){
            System.out.print(f0+" ");
            f = f0+f1;
            f1 = f0;
            f0= f;
        }

	}

}
