package practice;

public class ManipulateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="selenium";
		
		String uname=name.toUpperCase();
		System.out.println("The uppercase is "+uname);
		
		char[] list=uname.toCharArray();
		
		for(int i=0;i<list.length;i++)
		{
			System.out.println("The list is "+list[i]);
		}
		
		

	}

}
