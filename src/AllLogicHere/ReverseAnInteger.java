package AllLogicHere;

public class ReverseAnInteger {

	public static void main(String[] args) {
		// this is not for interview because here not include edge test cases
		int number = 123; // initialization
		int reverseNumber = 0;
		int lastDigit ;
		while(number != 0) {
		lastDigit = number%10; // 123%10 = 3 reminder
	
		reverseNumber = reverseNumber *10 + lastDigit;
		
      // o*10+3 =4
		number = number/10; // 123/10 = 12 quants
		}
		
		System.out.println(reverseNumber);

	}

}
