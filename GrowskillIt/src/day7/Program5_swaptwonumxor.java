package day7;

public class Program5_swaptwonumxor {
	public static void main(String[] args) {
		int num1=7,num2=6;
		num1=num1^num2;//7=111,6-110,num1=001//2^4 2^3 2^2 2^1 2^0=168421--s0 7 means 4+2+1=so 111
		num2=num1^num2;//001^110=111=7
		num1=num1^num2;//001^111=110=6
System.out.println(" num1 value" +num1);
		
		System.out.println("num2 value" +num2);
	}

}
