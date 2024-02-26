package practice;

import java.util.Scanner;

public class SumOfDigitsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=s1.nextInt();
		int sum=0;
		
		while(num!=0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		
		System.out.println("The sum of digits is "+sum);
		

	}

}
