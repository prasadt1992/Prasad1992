package practice;

public class DemoRemoveJunkCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name="%%%%%%%%%%%##############Prasad Tadasad@@@@@@@@@@@@@@@@@@@";
		String formattedname=name.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(formattedname);

	}

}
