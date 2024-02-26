package practice;

import java.util.Arrays;

public class DemoArrayEqualityUsingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {2,4,6,8,10};
		int arr2[]= {2,4,6,8,10};
		
		boolean status=Arrays.equals(arr1, arr2);
		
		
		
		if(status==true)
		{
			System.out.println("The arrays are equal");
		}
		else
		{
			System.out.println("The arrays are not equal");
		}

	}

}
