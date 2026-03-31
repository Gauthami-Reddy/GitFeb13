package day6_weekendcode;

public class Program3_reversenumber {
	public static void main(String[] args) {
		int num=1234;
		int reverse=0;
		for(;num>=0;num--) {
			  for (; num != 0; num /= 10) {
			        int digit = num % 10;
			        System.out.println(digit);
			        reverse = reverse* 10 + digit;
			    }
			  


			System.out.println(reverse);
			
		}
	}

}
