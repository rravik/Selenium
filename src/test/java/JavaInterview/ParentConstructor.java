package JavaInterview;

public class ParentConstructor {

	ParentConstructor()
	{
		this(5);
		System.out.println("Hi");
	}
	
	ParentConstructor(int x)
	{
		this(5,5);
		System.out.println("Hello");
	}
	
	ParentConstructor(int x, int y)
	{
		System.out.println("How are you");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentConstructor par = new ParentConstructor();

	}

}
