package Assignment;

public class Program3_fibnanociseries {
	public static void main(String[] args) {
		//other way
       // int n = 10;  // number of terms to print
//        int first = 0, second = 1;
//
//        System.out.print(first + " " + second + " ");
//
//        for (int i = 3; i <= n; i++) {
//            int next = first + second;
//
//            if (next > 100) {
//                break;  // stop if the number exceeds 100
//            }
//
//            System.out.print(next + " ");
//            first = second;
//            second = next;
//        }
        int count=10;

		int num1=0;

		int num2=1;

		System.out.print(num1+" "+num2+" ");

		int i=1;

		count=count-2;//first two numbers it atkes by default 0,1 so remaining we need to take so count-2 

		while(i<=count)//1<=8

		{			//num3=3

			int num3=num1+num2;//1

			System.out.print(num3+" ");

			num1=num2;//1

			num2=num3;//1

			i++;//2
			//2<=8,num1=1,num2=1
//			int num3=num1+num2;//2
//
//			System.out.print(num3+" ");
//
//			num1=num2;//1
//
//			num2=num3;//2
//
//			i++;//3
			//3<=8,num1=1,num2=2
//			int num3=num1+num2;//3
//
//			System.out.print(num3+" ");
//
//			num1=num2;//2
//
//			num2=num3;//3
//
//			i++;//3
			//3<=8,num1=2,num2=3
//			int num3=num1+num2;//5
//
//			System.out.print(num3+" ");
//
//			num1=num2;//3
//
//			num2=num3;//5

		}
    }

}
