package day1;

public class Program5_AssignmentStudentsmarks {
public static void main(String[] args) {
		
	//Convert the float marks into double
		
		float marks=87.6F;
		System.out.println(marks);	

		//Convert the float marks into double
			
		double marksfloat=(double)marks;
		System.out.println(marksfloat);	
		
		////Convert the float marks into int

		int marksint=(int)marks;
		System.out.println(marksint);
		
		 // Convert int to char (ASCII)
        char charValue = (char) marksint;
        System.out.println("Ascii value " + charValue);
}
		

}
