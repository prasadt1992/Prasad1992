package practice;

import java.util.Scanner;

public class RevAStringScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S1=new Scanner(System.in);
		System.out.println("Enter the String");
		String name=S1.nextLine();
		
		String rev="";
		for(int i=name.length()-1;i>=0;i-- )
		{
			rev=rev+name.charAt(i);
		}
		
		System.out.println("The reverse string is "+rev);
			
			
			
			
		

	}

}
