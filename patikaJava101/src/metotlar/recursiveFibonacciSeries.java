package metotlar;

import java.util.Scanner;

public class recursiveFibonacciSeries {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Metotlar pratik 2
		// Recursive Fibonacci Serisi Bulan Program
		// f(n) = f(n-1) + (n-2)
		// f(2) = 1 f(1) = 1 , f(0) = 0
		// 1 1 2 3 5 8 13 21 34 55	
		
		System.out.println(fib(44));

	}
	
	static int fib(int n) {
		if(n==1 || n==2) {
			return 1;
		}		
		return fib(n-1)+fib(n-2);
	}

}
