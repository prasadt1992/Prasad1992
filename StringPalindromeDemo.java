package practice;

import java.util.Scanner;

public class StringPalindromeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the string");
		String name=s1.nextLine();
		String Originalname=name;
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		
		if(rev.equalsIgnoreCase(Originalname))
		{
			System.out.println("The string is palindrome");
		}
		else
		{
			System.out.println("The string is not palindrome");
		}
		

	}

}
