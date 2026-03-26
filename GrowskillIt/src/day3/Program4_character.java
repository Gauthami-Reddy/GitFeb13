package day3;

public class Program4_character {
	public static void main(String[] args) {
		char ch1='A'; char ch2='a';
		while(ch1<='Z') {
			System.out.println(ch1+""+ch2);
			ch1++;
			ch2++;//if we comment this we get infinite loop
		}

}
}
