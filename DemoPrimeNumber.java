package practice;

import java.util.Scanner;

public class DemoPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s1.nextInt();
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("Number is prime");
			}
			else
			{
				System.out.println("Number is not prime");
			}
		}
		else
		{
			System.out.println("Number is not prime");
		}
			
			
		
		

	}

}
