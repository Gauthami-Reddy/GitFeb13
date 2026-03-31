package PracticeCode;

public class Program3_leapyear {
	public static void main(String[] args) {
	
	int year = 2024; // Year is hardcoded (no Scanner, no command line input)

    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is Not a Leap Year");
            }
        } else {
            System.out.println(year + " is a Leap Year");
        }
    } else {
        System.out.println(year + " is Not a Leap Year");
    }
}
}
		

