package practice;

import java.util.Date;

public class DemoDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d1=new Date();
		long abc=d1.getTime();
		System.out.println(abc);
		
		Date d2=new Date(d1.getTime());
		System.out.println(d2);

	}

}
