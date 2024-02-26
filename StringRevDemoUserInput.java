package practice;

import java.util.Scanner;

public class StringRevDemoUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the String");
		String name=s1.nextLine();
		
		
		for(int i=name.length()-1;i>=0;i--)
		{
		    char rev= name.charAt(i);
		    System.out.println(rev);
		}
		
	
	

	}

}
