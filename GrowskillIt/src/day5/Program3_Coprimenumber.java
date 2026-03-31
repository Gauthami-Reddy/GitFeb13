package day5;

public class Program3_Coprimenumber {
	
	//GCD should be 1
	
		public static void main(String[] args) {
	
		//we keep as 1 gcd initialvalue
			int num1 = 9;
			int num2= 12;
			int gcd = 1;
			
			int small=num1;//we dontknow which num is samll so by default keepimg small==num1
		int big=num2;
			if(num2<num1)
			{
				small=num2;
			big=num1;
			}
			
			for(int fact=1;fact<=small;fact++)//factors from 1---small
				{
					if(small%fact==0 && big%fact==0) {//if both satosfies then gcd updates
					gcd=fact;	
				}
			
			

			
			}
			System.out.println(gcd);
			

		
		if(gcd==1) {
			System.out.println("coprime");
		}
}
}
		
		
