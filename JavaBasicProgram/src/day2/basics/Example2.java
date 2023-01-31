package day2.basics;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addTwoNumbers(25,35);
		addTwoNumbers(10,20);
		Example2.addTwoNumbers(65,45);
		Example2.addTwoNumbers(25,95);
		Example2.addTwoNumbers(58,41);
	}
	static void addTwoNumbers(int num1,int num2) {//int num1=25,int num2=35
		int res=num1+num2;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Result is: "+res);

	}
}
