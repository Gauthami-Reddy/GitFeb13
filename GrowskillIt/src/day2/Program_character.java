package day2;

public class Program_character {
	public static void main(String[] args) {
	char ch='9';
	if(ch >='A'&& ch <='Z') {
		System.out.println("character is uppercase");			
	}
	else if(ch>='a'&&ch<='z') {
		System.out.println("character is lowercase");			
	}
	else if(ch>='0'&&ch<='9') {
		System.out.println("Digit");			
	}
	else
	{
		System.out.println("Special character");
	}
	}

}
