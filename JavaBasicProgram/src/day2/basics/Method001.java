package day2.basics;

public class Method001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addTwoNumbers(25, 50);
		addTwoNumbers(20, 10);
		addTwoNumbers(5, 50);
		addTwoNumbers(55, 50);
		addTwoNumbers(25, 70);
		addTwoNumbers(55, 40);

	}
	public static void addTwoNumbers(int num1,int num2) {
		int res=num1+num2;
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		System.out.println("Res: "+res);
	}
}
