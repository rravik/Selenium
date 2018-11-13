package JavaInterview;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class JavaInterview {

	@Test
	public void compare()
	{
		String s1 = "Ravi";
		String s2 = "Ravi";
		
		System.out.println("S1 == S2 is "+ s1==s2);
		
	}
	
	
	public void removeDuplicates()
	{
		
		int[] num = {23,45,53,12,45, 23,};

Set<Integer> dup = new TreeSet<Integer>();
		
		for(int i=0; i<num.length; i++)
		{
			
			dup.add(num[i]);
		}
		
		System.out.println(dup);

		
		
		
		
	}
	
	public void singleArrayMaxNumber()
	{
		
		int[] num = {23,45,53,12,45};
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0; i<num.length; i++)
		{
			
			arr.add(num[i]);
		}
		
		Integer i =Collections.max(arr);
		
		
		
		
		
		
		System.out.println(i);
	}
	
	public void wordReverse()
	{
		
		String word= "I am learning Seelnium";
		String[] split = word.split(" ");
		String reverseString = "";
		
			
		for(int i=0; i<split.length; i++)
			{
			
			String reverseWord = "";
			for(int j= split[i].length()-1; j>=0; j--)
			{
				
				reverseWord = reverseWord + split[i].charAt(j);
				
			}
			
			reverseString = reverseString + reverseWord + " ";
		}

		System.out.println(reverseString);
	
		
		
		
		
	}
	
	
	public void equals()
	{
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3=s1;
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}
	
	
	public void wordCount()
	{
		
		String word = "This is for counting the words";
		
		String [] count = word.split(" ");
		
		System.out.println(count.length);
		
	}
	
	public void primeNumber()
	{
		
		int[] num = {12, 11, 10, 324,333};
		
		
		for(int i=0; i<num.length; i++)
		{
			
			if(num[i]%2==0)
			{
				
				System.out.println(num[i] +" This is the prime number");
			}
			else
			{
				System.out.println(num[i] + " this is not a prime number");
			}
			
		}
		
		
		
	}
	
	public void removeExtraWhiteSpaces()
	{
		
		String text = "   Make   Selenium      Easy   ";
		
		text = text.trim().replaceAll("  ", " ");
		
		System.out.println(text);
		
	}
	
	public void removeallvowels()
	{
		String name = "selenium";
		
		name = name.replaceAll("[^aeiou]", "");
		
		System.out.println(name);
		
	}
	
	public void dateFormat() throws ParseException
	{
		
		
		SimpleDateFormat formatter = new SimpleDateFormat("mm-dd-yyyy");
		Date date = formatter.parse("10-26-2018");
		//String strDate= formatter.format("12-27-2018");  
	    System.out.println(date.getDay());  
		
	}
	
	
public void removeDuplicateCharacters()
{
		String name = "RaviKumar";
		String rev = "";
		for(int i=0; i<name.length(); i++)
		{
			
			for(int j=i+1; j<name.length(); j++)
			{
				if(name.charAt(i)!=name.charAt(j))
				{
					rev = rev+name.charAt(i);
					System.out.print(name.charAt(i));
					
					
				}
				
				
				
			}
			
		}
		
		
		
}
	
	
	public void stringSplit()
	{
		String city = "Chennai, vellore, Tuticorin, Coimbatore ";
		
		String[] cityArray = city.split(",");
		for(int i=0; i<cityArray.length; i++)
		{
			
			System.out.println(cityArray[i].trim());
		}
		
		
		
	}
	
	
	public void swapTwoNumber()
	{
	 int a = 10;
	 int b = 15;
	 
	 a = a+b;//25
	 b = a-b;//10
	 a = a-b;
	 System.out.println(a +" "+b);
	 
		
	}
	
	
	public void factorialNumber() {
	
	int num = 6;
	int factorial = 1;
	
	for (int i=1; i<=num; i++)
		
		factorial = factorial * i;//1*1 = 1; 
		System.out.println(factorial);
	
	}
	
	
	public void randomNumber() {

		Random rand = new Random();
		int rand_1 = rand.nextInt(5) + 1;
		System.out.println(rand_1);

	}

	
	public void reverseNumber() {

		int num = 12345;
		int reverse = 0;
		int remainder;

		while (num > 0) {
			
			reverse = reverse*10;
			reverse = reverse + num%10;
			//remainder = num % 10;
			//reverse = reverse * 10 + remainder;
			num = num / 10;

		}
		System.out.println(reverse);

	}
	
	
	
	public void fibonnic() {
		int a = 0;
		int b = 1;
		int c;
		long d = 10;
		System.out.print(a + " " + b);
		for (int i = 0; i < d; i++) {

			c = a + b;
			a = b;
			b = c;
			System.out.print(" " + c);

		}

	}

	public void armstrongNumber() {
		int num = 371;
		int a = num;
		int check = 0;
		int remainder;

		while (num > 0) {
			remainder = num % 10;
			check = check + (int) Math.pow(remainder, 3);
			num = num / 10;

		}

		if (check == 0) {
			System.out.println(a + " is a armstrong");

		} else {
			System.out.println(a + " a is a not armstrong");
		}
	}

	public void palindrome() {
		int num = 22;
		int a = num;
		int reverse = 0;
		int remainder;

		while (num > 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}

		if (reverse == a) {
			System.out.println(a + " is a palindrome");
		} else {
			System.out.println(a + " is a not palindrome");
		}
	}

	public void small_largenumber() {
		int numArray[] = { 55, 65, 45, 95, 75, 3 };
		int smallno = numArray[0];
		int largeno = numArray[0];

		for (int i = 1; i < numArray.length; i++) {

			if (numArray[i] > largeno) {
				largeno = numArray[i];
			} else if (numArray[i] < smallno) {
				smallno = numArray[i];
			}

		}

		System.out.println("largest number is" + largeno);
		System.out.println("largest number is" + smallno);
	}

	public void stringComparison() {
		String s1 = "Test";
		String s2 = "Selenium Testing";

		System.out.println("equals " + s1.equals(s2));
		System.out.println("contains " + s1.contains(s2));
		System.out.println("content equals" + s1.contentEquals(s2));

	}

	public void split() {
		String date = "17-10-2018";

		String[] day = date.split("-");

		for (String spl : day) {
			System.out.println(spl);
		}

	}

	public void reverseString() {
		String act = "Selenium";
		//String rev = "";

		for (int i = act.length() - 1; i >= 0; i--) {
			System.out.print(act.charAt(i));
		}
	}

	public void stringConversion() {
		String str1 = "HELLO";
		String str2 = " world";

		System.out.println(str1.toLowerCase());
		System.out.println(str2.toUpperCase());

	}

	
	public void subString() {
		String str1 = "Tester";

		str1 = str1.substring(0, 4);
		System.out.println(str1);

	}

	public void getLocalHostAddress() throws UnknownHostException {
		System.out.println(InetAddress.getLocalHost());
	}

	
	public void powerofNumber() {
		System.out.println(Math.pow(5, 6));
	}

	public void extractNumber() {
		String s = "abcd1234";
		s = s.replaceAll("[^0-9]", "");
		System.out.println(s);

	}

}
