package classes.salaryCalculator;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public double tax() {
		if(this.salary>=0&&this.salary<=1000)
			return 0;
		return this.salary*0.03;
	}
	
	public double bonus() {		 
		return (this.workHours-40)*30.0;
	}
	
	public double raiseSalary() {
		int workYear=2021-this.hireYear;
		
		if (workYear>=0&&workYear<10) 
			return this.salary*0.05;
		else if(workYear>9 && workYear<20) 
			return this.salary*.010;
		else 
			return this.salary*0.15;
		
	}	
	
	
	@Override
	public String toString() {		
		return "Adý : "+this.name+"\n"+
				"Maaþý : "+this.salary+"\n"+
				"Çalýþma Saati : "+this.workHours+"\n"+
				"Baþlangýç Yýlý : "+this.hireYear+"\n"+
				"Vergi : "+ tax()+"\n"+
				"Bonus : "+bonus()+"\n"+
				"Maaþ Artýþý : "+ raiseSalary()+"\n"+
				"Vergi ve Bonuslar ile birlikte maaþ : "+(this.salary-tax()+bonus())+"\n"+
				"Toplam Maaþ: "+(this.salary+raiseSalary());
	}
	
}
