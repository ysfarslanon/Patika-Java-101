package classes.obs;

public class Course {
	String name;
	String code;
	String prefix;
	int examNote;
	int note;//S�zl� notu
	int notePercent;//S�zl� notu etki oran� %20 ise note un %80 i al�nacak
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
			System.out.println("��retmen ve ders b�l�mleri uyu�muyor!");
		}		
	}
	
	public void printTeacher(Teacher teacher) {
		if (this.teacher!=null) {
			System.out.println(this.name+" dersinin hocas� "+this.teacher.name);
		} else {
			System.out.println(this.name+" dersine adademisyen atanmam��t�r.");
		}
		
				
	}

}
