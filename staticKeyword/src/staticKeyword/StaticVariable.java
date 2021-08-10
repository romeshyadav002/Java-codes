package staticKeyword;

public class StaticVariable {
	int empid;
	String name;
	static String company="Greenway";
	
	StaticVariable(int empid, String name){
		this.empid= empid;
		this.name= name;
		//this.company= company;
	}
	void show() {
		System.out.println(empid+" "+name+ " "+company);
	}
	public static void main(String[] args) {
		StaticVariable e1= new StaticVariable(101, "Amit");
		e1.show();
		StaticVariable e2= new StaticVariable(102, "Romesh");
		e2.show();
	}
}
