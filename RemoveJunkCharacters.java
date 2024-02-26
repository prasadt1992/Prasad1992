package practice;

public class RemoveJunkCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="@@@@@@@@@@@@#############$$$$Prasad%%%%%%%%%%%###Tadasad";
		
		String formatted=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(formatted);

	}

}
