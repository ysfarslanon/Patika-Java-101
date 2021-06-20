package classes.obs;

public class Student {
	String name;
	String stuNo;
	String classes;
	Course c1;
	Course c2;
	Course c3;
	double avarage;
	boolean isPass;

	public Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.avarage = 0;
		this.isPass = false;
	}

	void addBulkExamNote(int note1, int note2, int note3) {
		if (note1 >= 0 && note1 <= 100) {
			this.c1.examNote = note1;
		}
		if (note2 >= 0 && note2 <= 100) {
			this.c2.examNote = note2;
		}
		if (note3 >= 0 && note3 <= 100) {
			this.c3.examNote = note3;
		}
	}

	void addBulkNote(int note1, int note2, int note3) {
		if (note1 >= 0 && note1 <= 100) {
			this.c1.note = note1;
		}
		if (note2 >= 0 && note2 <= 100) {
			this.c2.note = note2;
		}
		if (note3 >= 0 && note3 <= 100) {
			this.c3.note = note3;
		}
	}

	void calcAvarage() {
		double n1 = (this.c1.examNote*(100-this.c1.notePercent)/100)+(this.c1.note*this.c1.notePercent/100);
		double n2 = (this.c2.examNote*(100-this.c2.notePercent)/100)+(this.c2.note*this.c2.notePercent/100);
		double n3 =(this.c3.examNote*(100-this.c3.notePercent)/100)+(this.c3.note*this.c3.notePercent/100);
		this.avarage = (n1 + n2 + n3) / 3;
		System.out.println("\nOrtalamanýz: "+this.avarage);
	}

	void isPass() {
		calcAvarage();
		if (this.avarage > 55) {
			System.out.println("Sýnýfý geçtiniz.");
			this.isPass = true;
		} else {
			System.out.println("Sýnýfta kaldýnýz.");
			this.isPass = false;
		}
	}

	void printNote() {
		System.out.println(c1.name + " Notu\t:" + this.c1.note);
		System.out.println(c2.name + " Notu\t:" + this.c2.note);
		System.out.println(c3.name + " Notu\t:" + this.c3.note);
		System.out.println("Ortalamanýz: " + this.avarage);
	}

}
