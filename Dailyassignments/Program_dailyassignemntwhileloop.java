package Dailyassignments;

public class Program_dailyassignemntwhileloop {
	//Write a Java program using a while loop to print numbers from 1 to 50 with the following conditions:
	public static void main(String[] args) {
		int num=1;
		while(num<=50) {
			if(num%2==0 && num%5==0) {
				System.out.println(num * num); // square
            } else if (num % 2 == 0) {
                // Only multiple of 2
                System.out.println(num * num * num); // cube
            } else if (num % 5 == 0) {
                // Only multiple of 5
                System.out.println(num * 5);
            } else {
                // Optional: print the number as it is
                System.out.println(num);
            }
			num++;
		}
			
		}

}
