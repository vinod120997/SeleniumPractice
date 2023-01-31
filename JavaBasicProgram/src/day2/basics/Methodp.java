package day2.basics;

public class Methodp {

	public static void main(String[] args) {
		getAverage(25,30,36);
		getAverage(35,45,76);
		getAverage(85,37,96);
		Methodp.getAverage(45,80,36);

	}
	static void getAverage(int a,int b,int c) {
		int avg;
		avg=(a+b+c)/3;
		System.out.println("Num1: "+a);
		System.out.println("Num2: "+b);
		System.out.println("Num3: "+c);
		System.out.println("Avg: "+avg);
	}
}
