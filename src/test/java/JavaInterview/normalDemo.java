package JavaInterview;

import java.util.HashMap;



public class normalDemo extends abstractDemo {
	
	int i;
	static int j;
	public static int k;
	
	String name;
	int age;
	public normalDemo(String name, int age) {
		name=name;
		age=age;
		
	System.out.println(name +" "+age);
		
	}

	
	@Override
	public void anotherMethod() {
		// TODO Auto-generated method stub
		System.out.println("Abstract demo class is implemented in another method");
	}
	
	public static void method1()
	{
		System.out.println("method1");
	}
	
	public static void method1(int i)
	{
		
		System.out.println(i + "single parameter");
	}
	
	public final static void main (String[] args)
	{
		
//		abstractDemo obj = new normalDemo();
//		obj.mymethod();
//		obj.anotherMethod();
		
		

		method1();
		method1(10);
		
//		
	
		
		
		
		
		normalDemo nd = new normalDemo("Ravi", 37);
		
		System.out.println(nd);
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		 
	     //add elements to HashMap
	     hmap.put(1, "AA");
	     hmap.put(2, "BB");
	     hmap.put(3, "CC");
	     hmap.put(1, "DD");
	 
	     // Getting values from HashMap
	     String val=hmap.get(1);
	     System.out.println("The Value mapped to Key 4 is:"+ val);
		
	}


	@Override
	public void anotherMethod1() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void absandint() {
		// TODO Auto-generated method stub
		
	}

}
