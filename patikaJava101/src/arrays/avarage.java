package arrays;

public class avarage {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý diziler pratik 1
		// Dizideki Elemanlarýn Ortalamasýný Bulan Program
		// Dizideki sayýlarýn harmonik ortalamasýný hesaplayan programý yazýnýz.
		// Harmonik Ortalama formülü : n (eleman sayýsý) / elemanlarýn harmonik serisi
		// Harmonik seri :1+(1/2)+(1/3)+....+(1/n)

		int[] numbers = { 1,1,2};
		double[] harmonikSeri= new double[numbers.length];
		double sum=0.0;
		
		
		for (int i = 0; i < numbers.length; i++) {				
			for (int j = 0; j < numbers[i]; j++) {				
				harmonikSeri[i]+=(1.0/(j+1.0));	
			}	
			sum+=harmonikSeri[i];			
		}
		
		System.out.println("Dizideki sayýlarýn harmonik ortalamasý: "+(numbers.length/sum));
		
	}

}
