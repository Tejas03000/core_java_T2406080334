package assignment;

public class SchoolStudent extends Student{
	
	private String className;
	
	public SchoolStudent() {
		this.className = "";
	}
	
	public SchoolStudent(int rollNo, double percentage, String className) {
		super(rollNo, percentage);
		this.className = className;
	}
	
	@Override
	public void show() {
		super.show();
		System.out.println("Class Name = " + className);
	}

}
