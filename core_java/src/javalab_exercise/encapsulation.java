package javalab_exercise;

public class encapsulation {

	    private String name;
	    private int age;
	    
	public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

	public static void main(String[] args) {
	  encapsulation e = new encapsulation();
	  e.setName("Rahul");
      e.setAge(21);

      // Getting values using getters
      System.out.println("Name: " + e.getName());
      System.out.println("Age: " + e.getAge());
	  
	}

}
