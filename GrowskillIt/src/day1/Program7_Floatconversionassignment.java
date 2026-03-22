package day1;

public class Program7_Floatconversionassignment {
	public static void main(String[] args) {
	float value=97.8F;
	System.out.println(value);	
	
	//Convert it into:double (upcasting)
	double valuefloat=(double)value;
	System.out.println(valuefloat);	
	
	//Convert it into:int(downcasting)
	int valueint=(int)value;
	System.out.println(valueint);
	
	//Convert the final int value into a character
	char charValue= (char)value;
	System.out.println(charValue);
	

	
	
	
	
}

}
