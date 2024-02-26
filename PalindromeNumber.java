package practice;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the number :");
	int num=s1.nextInt();
	int orgnum=num;
	int rev=0;
	
	while(num!=0)
	{
		rev=rev*10+num%10;
		num=num/10;
	}
	
	System.out.println(rev);
	
	if(rev==orgnum)
	{
		System.out.println("Number is palindrome");
	}
	else
	{
		System.out.println("Number is not palindrome");
	}
	
	
	

	}

}
