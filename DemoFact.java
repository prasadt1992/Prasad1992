package practice;

import java.util.Scanner;

public class DemoFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s1.nextInt();
		int fact=1;
		
		for(int i=num;i>0;i--)
		{
			fact=fact*i;
		}
		
		System.out.println(fact);

	}

}
