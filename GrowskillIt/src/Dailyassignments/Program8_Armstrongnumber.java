package Dailyassignments;

public class Program8_Armstrongnumber {
	
	    public static void main(String[] args) {
	    	int n, temp, r, total = 0;
			n = 123;

			for (temp = n; temp > 0; temp /= 10) {
				r = temp % 10;
				total += Math.pow(r, 3);
			}

			if (total == n) {
				System.out.format("\n% d is an Armstrong Number", n);
			} else {
				System.out.format("\n% d is Not an Armstrong Number", n);
			}
		}
	}
	


