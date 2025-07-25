package StringLogic;

public class ComapareTwoStringorMore {

	public static void main(String[] args) {
		String name="sachin yadav ";// String literal
		String name2 = "Sachin"; // String literal
		String name3 = new String("Sachin"); // new keyword for object
		if(name==name2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

		if(name2.equals(name3)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
