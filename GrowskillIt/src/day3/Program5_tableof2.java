package day3;

public class Program5_tableof2 {
	public static void main(String[] args) {
		int num=2;
		while(num<=30) {
		
		if(num%10==0) {
			System.out.println("Bye");
			
		}
		else if(num%3==0) {
			System.out.println("hello");
		}
		else
			System.out.println(num);
		num=num+2;
	}
	}

}
