package practiceProblems;

public class Palindrome {

		public static void main(String[] args) {
		
		isPalindromeNumber(1002);
		  
		

	}
		public static void isPalindromeNumber(int num) {
		
		int t=num;
		int r=0;
		int sum=0;
		
		while(num>0) {
			r=num%10; //get the remainder
			sum=(sum*10)+r;
			num=num/10;
		}
			
		if(t==sum) {
			System.out.println("palindrome");
		}	
		else {
			System.out.println("not palindrome");
		}	
			
		}

}
