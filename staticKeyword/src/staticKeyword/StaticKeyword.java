package staticKeyword;

public class StaticKeyword {
	static {
		System.out.println("hello");
	}
	static {
		System.out.println("i am the second block");
	}
	public static void main(String[] args) {
		System.out.println("i am in main method.");
	}
	static {
		System.out.println("i am the last class");
	}
}
