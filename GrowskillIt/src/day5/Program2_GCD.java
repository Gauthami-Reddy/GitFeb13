package day5;

public class Program2_GCD {
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
			if(small%fact==0 && big%fact==0) {//if both satfies then gcd updates
			gcd=fact;	
		}
	
	

//A = 20, B = 30
//	Factors of A : (1, 2, 4, 5, 10, 20)
//	Factors of B : (1, 2, 3, 5, 6, 10, 15, 30)
//	Common factors of A and B : (1, 2, 5, 10)
//	Highest of the Common factors (GCD) = 10
	

}

	System.out.println(gcd);

	}
}
