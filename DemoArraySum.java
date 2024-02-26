package practice;

public class DemoArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[5];
		arr[0]=1;
		arr[1]=3;
		arr[2]=4;
		arr[3]=5;
		arr[4]=6;
		
		int sum=0;
		
		/*for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}*/
		
		for(int value:arr)
		{
			sum=sum+value;
		}
		
		System.out.println(sum);

	}

}
