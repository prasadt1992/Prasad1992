package practice;

public class DemoOccurenceOfACharacter {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Welcome to India";
		int count=0;
		int i=0;
		
		for(i=0;i<name.length()-1;i++)
		{
			for(int j=i+1;j<name.length();j++)
			{
				if(name.charAt(i)==name.charAt(j))
				{
					count++;
				}
			}
		}
		
		System.out.println("The count of character "+name.charAt(i)+"is "+count);

	}

}
