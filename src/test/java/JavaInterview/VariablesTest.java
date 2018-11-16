package JavaInterview;

public class VariablesTest {

	//Class Variables - Collage name will be same for both departments so declared as class(static) variable.
	 public static String Collage_Name = "A1 Collage"; 
	 
	 //Instance Variables
	 private String Department = "Computer Engineering";
	 private String name; 
	 private double percentile;
	 
	 public VariablesTest(String student_name){//Constructor
		  //Can access Instance variable directly Inside constructor.
		  name = student_name;   
		 }  
		 public void setPercentage(double perc){
		  //Can access Instance variable directly Inside non static method.
		  percentile = perc;  
		 }
		  
		 public void print_details(){
		  int Year = 2014; //Local Variable - Can not access It outside this method.
		  System.out.println("Resultg Of Year = "+Year);
		  System.out.println("Student's Collage Name = "+Collage_Name);
		  System.out.println("Student's Department = "+Department);
		  System.out.println("Student's Name = "+name);  
		  System.out.println("Student's percentile = "+percentile+"%");
		  System.out.println("**********************");   
		 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Static Method
		  //Can access class variable directly If needed. i.e. Collage_Name
		VariablesTest student1 = new VariablesTest("Robert");
		  student1.setPercentage(67.32);
		  student1.print_details();
		  //Can access Instance variable using object reference If needed. 
		  //Example : student1.name = "Robert";
		  
		  VariablesTest student2 = new VariablesTest("Alex");
		  student2.setPercentage(72.95);
		  student2.print_details();
		  
		  System.out.println(Collage_Name  );
		  
		  VariablesTest one = new VariablesTest("Ravi");
		String dep =  one.Department="Testing";
		  System.out.println(dep);
		  
		 } 
		
	
		
		
	}


