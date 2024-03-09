package assignment;

public class Student {
	
	protected int rollNo;
	double percentage;
	
	public Student() {
		this.rollNo = 0;
		this.percentage = 0.0;
	}
	
	public Student(int rollNo, double percentage) {
		this.rollNo = rollNo;
		this.percentage = percentage;
	}
	
	public void show() {
		
		System.out.println("Roll no. = " + rollNo + "percentage = " + percentage);
		
	}

}
