package practice;

public class DemoMissingElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {1,2,3,5,6};
		int sum1=0;
		int sum2=0;
		int missingelement=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum1=sum1+arr[i];
		}
		
		System.out.println(sum1);
		
		for(int i=1;i<=6;i++)
		{
			sum2=sum2+i;
		}
		
		System.out.println(sum2);
		
		missingelement=sum2-sum1;
		System.out.println("Missing element is "+missingelement);

	}

}
