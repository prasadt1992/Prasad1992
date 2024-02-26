package practice;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Gadag";
		
		int len=name.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		
		System.out.println(rev);
		
		
		if(name.equalsIgnoreCase(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindome");
		}
		

	}

}
