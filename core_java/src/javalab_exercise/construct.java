package javalab_exercise;

public class construct {

	private int sid;
	private String sname;
	private static int marks;
       


	public construct(int sid, String sname, int marks) {
		
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	
	
	
	
	construct() {
		
		
		
	}
    construct(int sid,String sname) {
		
		this.sid = sid;
		this.sname = sname;
		
		
	}
	
	public void display() {
		System.out.println(" Student id :"+sid+ "\n Student Name :"+sname+"\n Student Marks : "+marks);
	}

	public static void main(String[] args) {
		construct s1 = new construct(1,"Jatin",97);		
		s1.display();
		construct s2 = new construct(1,"Jatin");		
		s2.display();
		construct s3 = new construct();		
		s3.display();
		
		
	}

}
