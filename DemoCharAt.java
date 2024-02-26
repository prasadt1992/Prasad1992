package practice;

public class DemoCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String m1="Software";
		String m2="Testing";
		
		String m3=m1.concat(m2);
		
		for(int i=0;i<m3.length();i++)
		{
			System.out.println(m3.charAt(i));
		}

	}

}
