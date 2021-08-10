package staticKeyword;

public class StaticVariable2 {
	static int count=0;
	StaticVariable2(){
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		StaticVariable2 c1= new StaticVariable2();
		StaticVariable2 c2= new StaticVariable2();
		StaticVariable2 c3= new StaticVariable2();
	}
}
