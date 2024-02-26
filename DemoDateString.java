package practice;

import java.util.Date;

public class DemoDateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d1=new Date();
		d1.getTime();
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		String abc=d2.toString();
		String day=abc.substring(0, 3);
		String month=abc.substring(4, 7);
		String date=abc.substring(8, 10);
		String year=abc.substring(24);
		System.out.println(day);
		System.out.println(month);
		System.out.println(date);
		System.out.println(year);
		
		
		

	}

}
