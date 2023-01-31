package day2.basics;

public class Sample2 {
	static double res;
	static public void square() {
		System.out.println("No Parameter Method Called");
	}
	static public void square(int number) {
		res = number * number;
		System.out.println("Method with Integer Argument Called:" + res);
	}
	static public void square(double number) {
		res = number * number;
		System.out.println("Method with float Argument Called:" + res);
	}

	public static void main(String[] args) {
		Sample2.square(2.5f);
		Sample2.square();
		Sample2.square(5);
		

	}

}
