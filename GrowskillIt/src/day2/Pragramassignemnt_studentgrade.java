package day2;

public class Pragramassignemnt_studentgrade {
	public static void main(String[] args) {
		
		    
 int num=0;
		        int[] marks = new int[5];
		        boolean fail = false;
		        int total = 0;

		        // Input marks for 5 subjects
		        System.out.println("Enter marks for 5 subjects (out of 100):");
		        for (int i = 0; i < 5; i++) {
		            System.out.print("Subject " + (i + 1) + ": ");
		           // marks[i] = num.nextInt();

		            if (marks[i] < 33) {
		                fail = true;
		            }
		            total += marks[i];
		        }

		        // Check fail condition
		        if (fail) {
		            System.out.println("Result: Fail");
		            System.out.println("Grade: F");
		        } else {
		            // Calculate percentage
		            double percentage = total / 5.0;
		            System.out.println("Result: Pass");
		            System.out.println("Percentage: " + percentage + "%");

		            // Assign grade based on percentage
		            String grade;
		            if (percentage >= 90) {
		                grade = "A+";
		            } else if (percentage >= 75) {
		                grade = "A";
		            } else if (percentage >= 60) {
		                grade = "B";
		            } else if (percentage >= 50) {
		                grade = "C";
		            } else {
		                grade = "D";
		            }

		            System.out.println("Grade: " + grade);
		        }

		    
		}

}
	

 
  
  



