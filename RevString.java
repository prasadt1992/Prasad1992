package practice;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Prasad";
		String rev="";
		int lname=name.length();
		System.out.println(lname);
		
		
		for(int i=lname-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		
		System.out.println(rev);
		

	}

}
