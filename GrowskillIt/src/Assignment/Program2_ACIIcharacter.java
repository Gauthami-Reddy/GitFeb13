package Assignment;

public class Program2_ACIIcharacter {
	public static void main(String[] args) {
	//Write a Java program that:

		//Takes a character input from the user (e.g., 'A').
		//Finds and prints its ASCII value.
	char alpha='A';
	int value = alpha;
	

	 int value3=value+ 5;
	 System.out.println("Value returned " + value3);
	 
	//Converts the new value back to a character and prints it.
	char charValue = (char) value3;
    System.out.println("Ascii value " + charValue);
	
}

}
