package JavaInterview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class Hashmap {

	public void fibonnic() {
		int a = 0;
		int b = 1;
		int c;
		long d = 15;

		System.out.print(a + " " + b);

		for (int i = 0; i < d; i++) {

			c = a + b;// 1 2 3 5
			a = b; // 1 1 2
			b = c; // 1 2 3
			System.out.print(" " + c);
		}

	}

	@Test
	public void hashmapone() {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		/* Adding elements to HashMap */
		hmap.put(12, "Chaitanya");
		hmap.put(2, "Rahul");
		hmap.put(7, "Singh");
		hmap.put(49, "Ajeet");
		hmap.put(3, "Anuj");
		hmap.put(null, "Ravi");
		hmap.put(null, "kumar");

		System.out.println(hmap.get(2));

		for (Map.Entry ne : hmap.entrySet()) {

			System.out.println(ne);
		}

		Iterator me2 = hmap.entrySet().iterator();
		while (me2.hasNext()) {

			Map.Entry me3 = (Map.Entry) me2.next();
			System.out.println("Key : " + me3.getKey() + " value : " + me3.getValue());
		}

	}

}
