package assignment;

public class CollegeStudent extends Student {

	private int semester;
	
	public CollegeStudent() {
		this.semester = 0;
	}
	
	public CollegeStudent(int rollNo, double percentage, int semester) {
		super(rollNo, percentage);
		this.semester = semester;
	}
	
	@Override
	public void show() {
		super.show();
		System.out.println("semester = "+ semester);
	}
}
