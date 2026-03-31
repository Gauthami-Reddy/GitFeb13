package day7;

public class Program2_whileloopcontinue {
	public static void main(String[] args) {
		System.out.println("Hello");
		int i=0;
	while(i<=9) {
		i++;//this we need to write starting for continue stmt otherwise it will excute infinite loop
			if(i==5) { 
				
			
			continue;//it will not exceute that particular one and continue with next statemnet ,ex--i--5 not execures goe swith 6 iteration
		}
			System.out.print(i+ " ");
	
		}
			System.out.print("\nBye");
		
		
	}
//int i=0;
//	while(i<=9) {
//		//this we need to write starting for continue stmt otherwise it will excute infinite loop
//			if(i==5) { 
//				
//			i++//if we write here infinite loop prints
	
//			continue;//it will not exceute that particular one and continue with next statemnet ,ex--i--5 not execures goe swith 6 iteration
//		}
//			System.out.print(i+ " ");
//	
//		}
//			System.out.print("\nBye");
//		
		



}
