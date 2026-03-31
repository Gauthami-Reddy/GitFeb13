package day8starpatterns;

public class Program6_starpatternprint {
	public static void main(String[] args){
//***
//***
//***
//***
//***
//print 3 tarts 5 times
	System.out.println("***");
	System.out.println("***");
	System.out.println("***");
	System.out.println("***");
	System.out.println("***");
//	
	//using for loop
	for(int i=0;i<=5;i++) {
		System.out.println("***");
	}
	
	//using 2 loops
	for(int i=0;i<=4;i++) {//print how many times
	 for(int j=1;j<=3;j++) {//print rows 3 stars
		 System.out.print("*");
		}
		System.out.println("");
	}
	
}
}
