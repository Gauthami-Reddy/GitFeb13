package day2;

public class Program2_voteEligibilty {
	public static void main(String[] args) {
		
		int age=18;
		if(age==18) {
			System.out.println("Congrats fr your first vote");			
		}
		if(age >=18) {
			System.out.println("You can vote");//this lso prints beacuse it has gretaer than or eqaul to
			
		}else
		{
			System.out.println("You cannot vote");
		}
		
		int age1=19;
		if(age1==19) {
			System.out.println("Congrats fr your first vote");			
		}
		if(age1 >19) {   //this is false not satisfying condition soprints else statement
			System.out.println("You can vote");
		}else
		{
			System.out.println("You cannot vote");
		
	}

	}
}
