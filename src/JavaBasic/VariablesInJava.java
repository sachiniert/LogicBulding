package JavaBasic;

public class VariablesInJava {
	int x=10; // instance variable
	static int var=20; // static variable

	public static void main(String[] args) {
		
		int y = 30; // local variable
		VariablesInJava vj = new VariablesInJava();// creating object
		System.out.println(vj.x);//10
		System.out.println(VariablesInJava.var);// static variable direct call class.varablename
		System.out.println(y);
		
		

	}

}
