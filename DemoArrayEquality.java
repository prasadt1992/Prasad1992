package practice;

public class DemoArrayEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr1[]= {2,4,6,8,10,12};
		int arr2[]= {2,4,6,8,10,12};
		boolean status=true;
		
		if(arr1.length==arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]!=arr2[i])
				{
					status=false;
				}
				else
				{
					status=true;
				}
			}
			
			if(status=true)
			{
				System.out.println("Arrays are equal");
			}
			else
			{
				System.out.println("Arrays are not equal");
			}
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		

	}

}
