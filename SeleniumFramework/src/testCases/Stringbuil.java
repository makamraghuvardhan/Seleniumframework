package testCases;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.testng.annotations.Test;

public class Stringbuil {

	@Test(description="This program is for string reverse")
	public void reverseAString()
	{
		System.out.println("-----------------------------------Method One----------------------");//Method one
		String input="RaghuVardhan";
		System.out.println("Actual String is : " + input);
		for(int i=input.length()-1;i>=0;i--)
		{
			System.out.print(input.charAt(i));
		}
		System.out.println("");
		System.out.println("-----------------------------------Method Two----------------------");//Method one//Method two using String buffer
		StringBuffer str=new StringBuffer("Raghuvardhan");
		System.out.println("Reverse of string is "+str.reverse());
	}
	@Test(description="This program is for checking the string as polydrome ")
	public void polydrome()
	{
		System.out.println("-----------------------------------Method One----------------------");//Method one//method one
		String input="rotator",reverse="";
		for(int i=input.length()-1;i>=0;i--)
			reverse=reverse+input.charAt(i);
		if(reverse.equals(input))
		{
		System.out.println("THe input is polydrome");
		}
		else{
			System.out.println("The input is not polydrome");
		}
		System.out.println("-----------------------------------Method Two----------------------");//Method one//Method two
		StringBuffer str=new StringBuffer(input);
		str.reverse();
		if(str.reverse().equals(input))
		{
			System.out.println("The input is polydrome");
		}
		else
		{
			System.out.println("The input is not polydrome");
		}
	}
	@Test(description="This program is for finding duplicates : ")
	public void tofindduplicates()
	{
		System.out.println("------------------------------To find duplicates--------------------------");
		String fst="raghu";
		char[] arr=fst.toCharArray();
		//String[] arr={"raghu","vardhan","raghu"};
		//int[] arr={1,2,3,5,2,4,5,9};
		for(int i=0;i<arr.length;i++)
		{
			boolean isdist=true;
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					isdist=false;
				}
			}
			if(!isdist)
			{
				System.out.println(arr[i]);
			}
		}
	}
	
	@Test(description="Program for changing the ")
	public void alternateuppercase()
	{
		String str="raghu is good boy";
		String[] spl=str.split("\\s");
		for(String wr:spl)
		{
		System.out.println(wr);
		}
	}
	
	
	@Test
	public void dupintwostrings()
	{
		String a="programmer";
		String b="Developper";
		StringBuilder sb=new StringBuilder();
		Set<Character> se=new HashSet<Character>();
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if(b.indexOf(ch)!=-1)
			{
				se.add(Character.valueOf(ch));
			}
		}
		Iterator<Character> it=se.iterator();
		while(it.hasNext())
		{
			sb.append(it.next().charValue());
		}
		System.out.println(sb.toString());
	}


}
