package day6_weekendcode;

public class Program1_swaptwonumbers {
	public static void main(String[] args) {
		
		//without thirdvariable
		 int a= 9, b = 5;
	        a=a+b;
	        b=a-b;
	        a=a-b;
	        System.out.println("a ="+a+" b=" +b);
	      //with third variable  
	        int x=10,y=20,z;
	        z=x;
	        x=y;
	        y=z;
	        System.out.println("x ="+x+" y=" +y);
	        
	}
}

