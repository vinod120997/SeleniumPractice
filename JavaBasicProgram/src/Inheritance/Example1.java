package Inheritance;
class vehicle{
	public void wheel() {
		System.out.println("i have wheel ");
	}
}
class car extends vehicle {
	public void countwheel(){
		System.out.println("i am car i have 4 wheel");
	}
}
public class Example1 extends car{

	public static void main(String[] args) {
		
		Example1 e1 = new Example1();
        e1.wheel();
        e1.countwheel();
	}

}
