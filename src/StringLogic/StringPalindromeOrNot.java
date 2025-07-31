package StringLogic;

public class StringPalindromeOrNot {

	public static void main(String[] args) {
		// isme hame kya karna hota hai pahle string ko reverse karke use chekc karna hota hai palidrome hai ki nhi
		
		String name ="madam";
		String rev = "";
		
		for(int i = name.length()-1; i>=0; i--)
		{
			rev = rev+ name.charAt(i);
		}
		//System.out.println("reverse string is :"+rev);
		
		if(name.equals(rev)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}

	}

}
