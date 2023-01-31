package Method;
class demo1{
	demo1(int num){
		System.out.println("demo1 num is :"+num);
	}
	void display() {
		System.out.println("i am demo1");
	}
	void businesshub(){
		System.out.println("demo1 is business hub");
	}
}
public class demo2 extends demo1{
	demo2(){
		super(25);
		System.out.println("demo1 is ");
	}
	void deccan () {
		System.out.println("deccan is in pune ");
		display();
		super.display();
	}
	void display() {
		System.out.println("i am displaying demo1");
	}

	public static void main(String[] args) {
		demo2 d1=new demo2();
		d1.deccan();
		d1.businesshub();
		System.out.println("***************");
		demo1 d2=new demo1(25);
		d2.businesshub();
		d2.display();
		//demo1 d3=new demo2();
		//d3.businesshub();
		//d3.display();

	}

}
