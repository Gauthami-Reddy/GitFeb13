package day2;

public class Program3_Elseif {
	
	public static void main(String[] args) {
		int age=19;
	if(age==18) {
		System.out.println("Congrats fr your first vote");			
	}
	else if(age >=18) {
		System.out.println("You can vote");//this lso prints beacuse it has gretaer than or eqaul to
		
	}else
	{
		System.out.println("You cannot vote");
	}
	}
	
	//else if execute--first if exceutes and check condition if not satisfy then go to e;se if
	//check with age =19 ,17 and 18 

}
