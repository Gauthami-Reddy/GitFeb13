package day8starpatterns;

public class Program2_starpatternincreasingorder {
//	*
//	**
//	***
//	****
	public static void main (String[] args) {
		int n=0;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println("");
		}
	}

}
