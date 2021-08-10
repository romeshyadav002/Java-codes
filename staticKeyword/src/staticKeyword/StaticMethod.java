package staticKeyword;

public class StaticMethod {
	static int i=10;
	int a=15;
	static void display() {
		//System.out.println(a);
		System.out.println(i);
		System.out.println("1");
		remember();
		
	}
	static void remember() {
		System.out.println("in remember method");
	}
	public static void main(String[] args) {
		StaticMethod.display();
		Xyz.show();
	}
}
class Xyz{
	static void show() {
		System.out.println("2");
	}
}
