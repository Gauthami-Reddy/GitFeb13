package day1;

public class Program6_Assignement2ASciivalue {
	public static void main(String[] args) {
		
		char alpha='A';
		int value = alpha;
		
	
		 int value3=value+ 5;
		 System.out.println("Value returned " + value3);
		 
		//Converts the new value back to a character and prints it.
		char charValue = (char) value3;
        System.out.println("Ascii value " + charValue);
        
        
        int value1=value+7;
        char charvalue=(char) value1;
        System.out.println("Ascii value " + charvalue);
		
	}

}
