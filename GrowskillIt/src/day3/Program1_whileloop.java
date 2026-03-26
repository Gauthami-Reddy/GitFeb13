package day3;

public class Program1_whileloop {
	public static void main(String[] args) {
		int num=1;
		while(num<=10) {//condition if satifies loop executes
			System.out.println(num);
			num++;//if we comment this we get infinite loop
		}
		System.out.println("outside" +num);
	}

}
