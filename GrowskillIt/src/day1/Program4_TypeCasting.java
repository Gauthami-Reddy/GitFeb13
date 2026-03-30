package day1;

public class Program4_TypeCasting {
	public static void main(String[] args) {
		
		//upcasting
		int age=32;
		float agefloat=age;
		System.out.println(agefloat);
		
		int num=100;
		long numLong=num;
		System.out.println(numLong);
		
	
		
		
		//Downcasting
		
		float height=153.2f;
		int heightint=(int)height;
		System.out.println(heightint);	
		//phone number is long and convert to int is not possible as integer small value so output is getting different
		//if we need we can use string concept
		long phoneNumber1=4532367890L;
		int longPhonenumber=(int)phoneNumber1;
		System.out.println(longPhonenumber);	
		
		
				
	}

}
