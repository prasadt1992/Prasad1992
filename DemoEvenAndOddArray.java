package practice;

public class DemoEvenAndOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={3,4,5,6,8,4,7,2,9};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("The number "+arr[i]+" is even");
			}
			else
			{
				System.out.println("The number "+arr[i]+" is odd");
			}
		}
		

	}

}
