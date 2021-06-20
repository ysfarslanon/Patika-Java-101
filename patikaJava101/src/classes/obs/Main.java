package classes.obs;

public class Main {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikasý Sýnýflar pratik 1
		// Öðrenci Bilgi Sistemi

		Teacher t1 = new Teacher("Ýlber ORTAYLI", "TRH", "111");
		Teacher t2 = new Teacher("Nikola TESLA", "FZK", "222");
		Teacher t3 = new Teacher("Aziz SANCAR", "KMY", "333");

		Course tarih = new Course("Tarih", "101", "TRH",10);
		Course fizik = new Course("Fizik", "101", "FZK",10);
		Course kimya = new Course("Biyoloji", "101", "KMY",10);		

		Student s1 = new Student("Sinan AKYOKUÞ", "123", "4", tarih, fizik, kimya);
		Student s2 = new Student("Hilal KOYUN", "789", "2", tarih, fizik, kimya);
		Student s3 = new Student("Zeki ÇÝMEN", "205", "3", tarih, fizik, kimya);
		
		tarih.addTeacher(t1);
		fizik.addTeacher(t2);
		kimya.addTeacher(t3);
		
		
		s1.addBulkExamNote(100, 100, 100);
		s1.addBulkNote(100, 100, 100);
		s1.isPass();
		
		
		s2.addBulkExamNote(10, 10, 10);
		s2.addBulkNote(10, 10, 10);
		s2.isPass();
		
		s2.addBulkExamNote(80, 50, 40);
		s2.addBulkNote(80, 100, 40);
		s2.isPass();
		
		

	}

}
