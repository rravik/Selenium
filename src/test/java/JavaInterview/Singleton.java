package JavaInterview;

public class Singleton {

	
	  //create an object of SingleObject
	   private static Singleton instance = new Singleton();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private Singleton(){}

	   //Get the only object available
	   public static Singleton getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Hello World!");
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		Singleton object = new Singleton();
		object.showMessage();
		
	}
}
