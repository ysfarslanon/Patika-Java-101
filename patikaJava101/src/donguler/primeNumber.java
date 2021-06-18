package donguler;

public class primeNumber {
	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Döngüler ödev 4
		// 1 – 100 Arasýndaki Asal Sayýlarý Bulan Program
		
		int count=0;
		
		for (int i = 2; i <= 100; i++) {
			//count=0;
			for (int j = 2; j < i; j++) {
				if (i%j==0) {
					count++;
					break;
				}				
			}	
			System.out.print(i+" ");
		}
	}

}
