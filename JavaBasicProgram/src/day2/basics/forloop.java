package day2.basics;

public class forloop {
	static void swapTwonumbers(int num1,int num2) {
		System.out.println("initial num1"+num1);
		System.out.println("initial num1"+num2);
		int temp=num1+num2;
		num1=temp-num1;
		num2=temp-num2;
		System.out.println("********After swaping*********");
		System.out.println("initial num1"+num1);
		System.out.println("initial num1"+num2);
	}

	public static void main(String[] args) {
		swapTwonumbers(20,30);
		
 }
}