package javalab_exercise;

public class Student {
	
	private int sid;
	private String sname;
	private int marks;

	public Student(int sid, String sname, double d) {
		
		this.sid = sid;
		this.sname = sname;
		this.marks = (int) d;
	}
	public void display() {
		System.out.println(" Student id :"+sid+ "\n Student Name :"+sname+"\n Student Marks : "+marks);
	}
	
	public static void main(String[] args) {
		
		
		Student s1 = new Student(1,"Jatin",97);		
		s1.display();
		
	}

}