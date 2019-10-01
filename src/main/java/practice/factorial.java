package practice;

public class factorial {
	
	static int num=4;
	static int fact=1;
	

	public static void main(String[] args) {
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
			
		}
		
		System.out.println("fact of the no is: " +fact);
	}

}
