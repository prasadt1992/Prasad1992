package practice;

import java.util.Scanner;

public class PalindromeNumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the number");
		int num=s1.nextInt();
		int Originalnum=num;
		
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
		if(rev==Originalnum)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}

	}

}
