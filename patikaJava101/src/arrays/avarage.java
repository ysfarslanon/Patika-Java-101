package arrays;

public class avarage {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� diziler pratik 1
		// Dizideki Elemanlar�n Ortalamas�n� Bulan Program
		// Dizideki say�lar�n harmonik ortalamas�n� hesaplayan program� yaz�n�z.
		// Harmonik Ortalama form�l� : n (eleman say�s�) / elemanlar�n harmonik serisi
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
		
		System.out.println("Dizideki say�lar�n harmonik ortalamas�: "+(numbers.length/sum));
		
	}

}
