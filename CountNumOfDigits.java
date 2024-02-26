package practice;

import java.util.Scanner;

public class CountNumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s1.nextInt();
		int count=0;
		int rev=0;
		int value=0;
		
		while(num!=0)
		{
			value=num%10;
			num=num/10;
			count++;
		}
		
		System.out.println("The number of digits is "+count);
		

	}

}
