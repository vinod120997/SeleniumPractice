package day2.basics;

public class Example5 {

	public static void main(String[] args) {
		int a=0,b;
		b=++a + ++a + a++ + ++a +a;
	// int 1 + 2  + 2 + 4 + 4
    // fin 1 + 2  + 3 + 4
        System.out.println(a);
        System.out.println(b);
        a=0;
        b= --a + --a + ++a + a++ + a;  
        System.out.println(a);
        System.out.println(b);
     
	}

}
