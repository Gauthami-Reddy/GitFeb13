package day5;
//factors of 20
public class Program1_factors {
 public static void main(String[] args) {
int num=20;
for(int fact=1;fact<=num;fact++) {
	if(fact==num)	{
		System.out.print(fact);
		
	}else if (num%fact==0){
		System.out.print(fact+",");
		
	}
}

     
 }
 
 }

