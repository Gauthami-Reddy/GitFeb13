package day4;

public class Program7_pllindrome {
	public static void main(String[] args) {
		int num=1001;
		int originalnum=num;
		int reverse=0;
		for(;num>0;num=num/10) {
		System.out.println(reverse);
	
	if(reverse==originalnum) {
		System.out.println("palindrome");
		
	}else {
		System.out.println("not palindrome");
	}

	
}
}
}
