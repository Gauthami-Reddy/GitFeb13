package day7;

public class Program4_swaptwonumbers {
	public static void main(String[] args) {
		//using temp value
		int num3=10,num4=20,temp=0;
		temp=num3;
		num3=num4;
		num4=temp;
		System.out.println("After swapping num1 value" +num3);
		
		System.out.println("After swapping num2 value" +num4);
//		
		
		//other way
		int num1=10,num2=20;
		num1=num1+num2;//30
		num2=num1-num2;//30-20=10
		num1=num1-num2;//30-10=20
System.out.println(" num1 value" +num1);
		
		System.out.println("num2 value" +num2);
		
	}

}
