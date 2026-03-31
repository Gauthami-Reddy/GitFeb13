package Assignment;

public class Program5_digittransformation {
	
	    public static void main(String[] args) {

	        int n = 57243;   // given input
	        int result = 0;
	        int place = 1;   // to track position (1 = rightmost)
	        int multiplier = 1; // to build final number

	        while (n > 0) {
	            int digit = n % 10;
	            int newDigit;

	            if (place % 2 == 1) { // odd position
	                if (digit <= 4) {
	                    newDigit = digit * 2;
	                } else {
	                    newDigit = digit;
	                }
	            } else { // even position
	                newDigit = 1;
	            }

	            result = result + (newDigit * multiplier);

	            multiplier *= 10;
	            place++;
	            n = n / 10;
	        }

	        System.out.println("Output: " + result);
	    }
	}

