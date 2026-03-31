package Assignment;

public class Program4_primefactors {
	
   // Method to print prime factors of a number
	    public static void main(String[] args) {
	    	int n=60;
	    
	    	int temp = n;

	        System.out.println("Unique prime factors:");

	        // Loop from 2 to n/2
	        for (int i = 2; i <= n / 2; i++) {

	            // 4. Stop if factor becomes greater than n/2
	            if (i > n / 2) {
	                break;
	            }

	            // Check if i is a factor
	            if (temp % i == 0) {

	                // Check if i is prime
	                boolean isPrime = true;
	                for (int j = 2; j <= i / 2; j++) {
	                    if (i % j == 0) {
	                        isPrime = false;
	                        break;
	                    }
	                }

	                // If prime, print it (unique only)
	                if (isPrime) {
	                    System.out.print(i + " ");
	                }

	                // Remove all occurrences of this factor
	                while (temp % i == 0) {
	                    temp /= i;
	                }
	            }
	        }
	    }
}

	   
	

	   
