package systemclass;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("system user id :"+System.getProperty("user.home"));
		System.out.println("current working directory :"+System.getenv("user.dir"));

	}

}
