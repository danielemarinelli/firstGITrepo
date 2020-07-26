package school;

public class TestSchool {

	
	
	public static void main(String[] args) {
		
		String studentname = "PAUL";		
		
		students student1 = new paul("Paul", 12, "black", "pass");	
		students student2 = new rita("Rita", 15, "red", "pass with remarks");

		if (studentname.toLowerCase().equals("rita")) {
			System.out.println(student2.getName());
			System.out.println(student2.getAge());
			System.out.println(student2.getHair());
			System.out.println(student2.getMark());
					} else  {
						System.out.println(student1.getName());
						System.out.println(student1.getAge());
						System.out.println(student1.getHair());
						System.out.println(student1.getMark());
						
					}
	}

}
