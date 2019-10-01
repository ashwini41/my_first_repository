package practice;

public class reverse_a_no {
//
//	static int num=2234;
//	static int reverse=0;
//	static int reminder=0;
	
	public static void main(String[] args) {
		
//		for(int i=0;i<=num;i++)
//		{	
//			 reminder = num%10;
//			reverse= reverse*10+reminder;
//			num=num/10;
//			
//		}
//System.out.println(reverse);
		
		  int num = 1234, reversed = 0;
	while(num!=0)
		  {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num /= 10;
	        }
	        System.out.println("Reversed Number: " + reversed);
	    }
	
}
