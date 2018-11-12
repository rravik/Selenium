package JavaInterview;

public class cons {
	
	public cons()
	{
		
		this(9);
		System.out.println("no arg constructor");
		
	}

	public cons(int i)
	{
		System.out.println("one arg constructor");
	}

	public cons(int i, int j)
	{
		System.out.println("two arg constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cons con = new cons();
		
		

	}

}
