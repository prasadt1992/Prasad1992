package practice;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Welcome to Java";
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		
		System.out.println("Reverse string is "+rev);

	}

}
