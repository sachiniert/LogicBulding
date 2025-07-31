package StringLogic;

public class StrigUseConcept {

	public static void main(String[] args) {
		String name ="Testing is important and testing best";
		System.out.println(name.charAt(0));// T
		//it will return the char value of given index
		//System.out.println(name.charAt(500));//StringIndexOutOfBoundsException
		System.out.println(name.charAt(name.length()-1));//t
		
		for(int i=0; i<=name.length()-1;i++)
		{
			
			System.out.print(name.charAt(i));
		}

	}

}
