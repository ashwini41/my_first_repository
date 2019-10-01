package practice;

public class STRING_NO {

	public static void main(String[] args) {
	
		String name="#%$^%^%&^&^java*(*(0909";
		
		String name1=name.replaceAll("[^a-zA-Z0-9)]", "");
		System.out.println(name1);
		
		
		

	}

}
