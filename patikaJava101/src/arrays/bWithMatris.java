package arrays;

public class bWithMatris {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý diziler pratik 3
		// Çok boyutlu diziler kullanýlarak "yýldýzlar" ile ekrana "B" harfi yazan programý yazýnýz.
		
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
