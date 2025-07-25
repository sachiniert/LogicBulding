package AllLogicHere;

public class StringIsPangramOrNot {

	public static void main(String[] args) {
		//conditon (1) 26 letters --> length() >= 26 compalsary 
     
		String input ="The quick brown fox jumps over the lazy dog";
		//loweer case
		input = input.toLowerCase();	
		System.out.println(input);
		boolean result = checkPangram(input);
		if(result) {
			
			System.out.println("Its a pangram");
		}else {
			System.out.println("Its not pangram");
		}
		
	}
	private static boolean checkPangram(String input) {
		     if(input.length()<26) 
		     {	 
		           return false;
		     }
		     for(char i='a';i<='z';i++) 
		          {
		    	     if(input.indexOf(i)<0) {
		    	    	 return false;
		    	     }
		    	 
		    	     //System.out.println(i);
		         }
		     return true;
	      }

}
