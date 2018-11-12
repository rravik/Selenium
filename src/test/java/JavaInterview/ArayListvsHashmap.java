package JavaInterview;

import java.util.ArrayList;
import java.util.Collections;


import org.testng.annotations.Test;

public class ArayListvsHashmap {
	
	@Test
	public void arrayList()
	{
		//Arraylist without datatype
		System.out.println("*******ArrayList without Datatype");
		ArrayList arra = new ArrayList();
		
		arra.add(1);
		arra.add("string");
		
		arra.add(1, "object");
		
		System.out.println(arra);
		System.out.println("*******ArrayList with Datatype");
		ArrayList<String> array = new ArrayList<String>();
		array.add("One");
		array.add("Two");
		array.add("Three");
		array.add("Four");
		array.add("Six");
		
		
		System.out.println(array);
		
		System.out.println("*****sorting array");
		Collections.sort(array);
		System.out.println(array);
	}

	
	public void HashMap()
	{
		
		
	}
}
