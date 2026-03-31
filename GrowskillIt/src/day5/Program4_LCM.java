package day5;

public class Program4_LCM {
	
	//LCM=12*18/GCD
	public static void main(String[] args) {
		//we keep as 1 gcd initialvalue
		int num1=12;

		int num2 = 18;

		int gcd =1;

		int lcm =1;

		

		int small = num1;

		int big = num2;

		

		if(num2<num1) {

			small = num2;

			big = num1;

		}

		

		for (int fact = 1; fact<=small; fact++){

			if(small%fact==0 && big%fact==0)

			gcd=fact;

		}


		
      lcm = num1*num2 / gcd;

		System.out.println(lcm);
}
	
}
