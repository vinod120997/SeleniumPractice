package day2.basics;

public class Method00 {

	public static void main(String[] args) {
		addTwonumbers(25,35);
        addTwonumbers(30,40,60);
	}
	public static void addTwonumbers (int num1, int num2) {
	  int res=num1+num2;
	  System.out.println("num1 is "+num1);
	  System.out.println("num2 is "+num2);
	  System.out.println("res is "+res);
	}
	public static void addTwonumbers(int a , int b, int c) {
		int res=a+b+c;
		System.out.println("A is "+a);
		System.out.println("B is "+b);
		System.out.println("C is "+c);
		System.out.println("res is "+res);
	}

}
