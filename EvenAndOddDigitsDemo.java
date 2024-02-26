package practice;

import java.util.Scanner;

public class EvenAndOddDigitsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s1.nextInt();
		int evencount=0;
		int oddcount=0;
		int value=0;
		while(num!=0)
		{
			value=num%10;
			num=num/10;
			
			if(value%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
		}
		
		System.out.println("The number of even digits are "+evencount);
		System.out.println("The number of odd digits are "+oddcount);
		

	}

}
