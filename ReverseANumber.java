package practice;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s1.nextInt();
		
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println("Reverse number is "+rev);
		

	}

}
