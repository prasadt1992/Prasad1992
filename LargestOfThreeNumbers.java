package practice;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=s1.nextInt();
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num2=s1.nextInt();
		Scanner s3=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num3=s1.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("The greater number is "+num1);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("The greater number is "+num2);
		}
		else
		{
			System.out.println("The greater number is "+num3);
		}

	}

}
