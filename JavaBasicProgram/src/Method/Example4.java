package Method;

public class Example4 {

	public static void main(String[] args) {
    addTwonumbers(25,35);
    addTwonumbers(54,35);
    addTwonumbers(25,85);
    addTwonumbers(98,35);
    addTwonumbers(65,35);
    final int age=25;
    System.out.println(age);
    avgofnumbers(35,25);
    
	}
     public static void addTwonumbers(int num1,int num2) {
    	 int res=num1+num2;
    	 System.out.println("num1 is "+num1);
    	 System.out.println("num2 is "+num2);
    	 System.out.println("res "+res);
    	 avgofnumbers(25,45);
    	 
     }
     public static void avgofnumbers(int a,int b) {
    	 int avg=a/b;
    	 System.out.println("A is "+a);
    	 System.out.println("b is  "+b);
    	 System.out.println("avg is "+avg);
     }
     public void numberispositiveornegative(int a,int b) {
    	 int res=a/b;
    	 System.out.println("A is "+a);
    	 System.out.println("B is  "+b);
    	 System.out.println("res "+res);
     }
}
