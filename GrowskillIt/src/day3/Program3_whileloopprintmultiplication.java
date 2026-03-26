package day3;

public class Program3_whileloopprintmultiplication {
	public static void main(String[] args) {
		int num=1;
		while(num<=10) {
			System.out.println("5 X "+num +"=" +(5*num));
			num++;//if we comment this we get infinite loop
		}
		
	}

}
