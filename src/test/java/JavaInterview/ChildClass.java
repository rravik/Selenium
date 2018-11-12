package JavaInterview;

public class ChildClass extends ParentClass {
//
//	ChildClass()
//	{
//		System.out.println("Constructor of Child Class");
//		
//	}
//	
//	
//	ChildClass(int num)
//	{
//		
//		System.out.println("arg constructor of child class");
//	}
	
	void printMsg()
	{
		
		display();
		
	}
	
	public static void foo()
	{
		
		System.out.println("I am in child foo");
	}
	
	public void bar()
	{
		
		System.out.println("I am bar in child");
	}
	
	public static void main (String args[])
	{
		
		ChildClass obj = new ChildClass();
		obj.printMsg();
		
		ParentClass par = new ChildClass();
		par.foo();
		obj.foo();
		
		obj.bar();
		par.bar();
	
	}
	
	
}
