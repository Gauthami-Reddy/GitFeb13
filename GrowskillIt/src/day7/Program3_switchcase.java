package day7;

public class Program3_switchcase {
	
	//days of week
	public static void main(String[] args) {
		int day=3;
		//output prints all from Wed...invalidas we are not using break statement
		switch(day) {
		case 1:System.out.println("Monday");
		case 2:System.out.println("Tuesday");
		case 3:System.out.println("Wednesday");
		case 4:System.out.println("Thursday");
		case 5:System.out.println("Friday");
		case 6:System.out.println("Saturday");
		case 7:System.out.println("Sunday");
		default:System.out.println("invalid");
		}
		
		
		//using break statement output
		//output prints only wednesday as break using and stops at this point
		switch(day) {
		case 1:System.out.println("Monday");break;
		case 2:System.out.println("Tuesday");break;
		case 3:System.out.println("Wednesday");break;
		case 4:System.out.println("Thursday");break;
		case 5:System.out.println("Friday");break;
		case 6:System.out.println("Saturday");break;
		case 7:System.out.println("Sunday");break;
		default:System.out.println("invalid");break;
		}
		
	}

}
