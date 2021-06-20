package classes.obs;

public class Teacher {	
	String name;
	String branch;
	String mpno;	
	
	public Teacher(String name, String branch, String mpno) {
		this.name = name;
		this.mpno = mpno;
		this.branch = branch;
	}

	void print() {
		System.out.println("Adý: "+this.name);
		System.out.println("Telefon numarasý: "+ this.mpno);
		System.out.println("Bölüm: "+this.branch);
	}
}
