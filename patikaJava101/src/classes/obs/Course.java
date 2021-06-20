package classes.obs;

public class Course {
	String name;
	String code;
	String prefix;
	int examNote;
	int note;//Sözlü notu
	int notePercent;//Sözlü notu etki oraný %20 ise note un %80 i alýnacak
	Teacher teacher;
	
	public Course(String name, String code, String prefix,int notePercent) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;		
		this.note = 0;
		this.examNote=0;
		this.notePercent=notePercent;
	}
	
	public void addTeacher(Teacher teacher) {
		if (teacher.branch.equals(this.prefix)) {
			this.teacher=teacher;
		} else {
			System.out.println("Öðretmen ve ders bölümleri uyuþmuyor!");
		}		
	}
	
	public void printTeacher(Teacher teacher) {
		if (this.teacher!=null) {
			System.out.println(this.name+" dersinin hocasý "+this.teacher.name);
		} else {
			System.out.println(this.name+" dersine adademisyen atanmamýþtýr.");
		}
		
				
	}

}
