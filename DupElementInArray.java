package practice;

public class DupElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,6,4,5,6,2,9,8};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}

	}

}
