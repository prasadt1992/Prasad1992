package practice;

public class DemoEqualityOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {2,4,6,8,9,10};
		int arr2[]= {2,4,6,8,9,10};
		
		int value1=arr1.length;
		int value2=arr2.length;
		
		boolean status=true;
		
		
		if(value1==value2)
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
		     
		     if(status==true)
		     {
		    	 System.out.println("The arrays are equal");
		     }
		     else
		     {
		    	 System.out.println("The arrays are not equal");
		     }
		}
		else
		{
			System.out.println("The arrays are not equal");
		}

	}

}
