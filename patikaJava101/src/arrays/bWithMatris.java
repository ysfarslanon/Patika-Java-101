package arrays;

public class bWithMatris {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� diziler pratik 3
		// �ok boyutlu diziler kullan�larak "y�ld�zlar" ile ekrana "B" harfi yazan program� yaz�n�z.
		
		String[][] letter= new String[7][4]; 
		
		 for (int i = 0; i < letter.length; i++) {
	            for (int j = 0; j < letter[i].length; j++) {
	                if (j==0||j==3) {
	                	letter[i][j]=" * ";
	                }else if (i==0||i==3||i==6) {
	                	letter[i][j]=" * "; 
	                }else {
	                	letter[i][j]="   ";
	                }
	                
	            }
	        }

	        for (String[] row : letter){
	            for (String col : row){
	                System.out.print(col);
	            }
	            System.out.println();
	        }
	}

}
