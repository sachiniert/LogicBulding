package AllLogicHere;

public class ReverseAnIntegerWithEdgeTestCase {

	// This solution is bettor for reverse number because inter is contains big number so thats reason we use this coding for reverse any leangth of number
	
	public static void main(String[] args) {
		int number = 234765857; // initialization
		int reverseNumber = 0;
		int lastDigit ;
		while(number != 0) {
		lastDigit = number % 10;
		//Check for overFlow
		if (reverseNumber > Integer.MAX_VALUE/10 || (reverseNumber == Integer.MAX_VALUE/10 && lastDigit >7)) {
		System.out.println(0);
		
		System.exit(0);
		
		}
		if (reverseNumber < Integer.MIN_VALUE/10 || (reverseNumber == Integer.MIN_VALUE/10 && lastDigit < -8)) {
			System.out.println(0);
			
			System.exit(0);
		}
		reverseNumber = reverseNumber*10 + lastDigit;
		number = number / 10;
		}
		System.out.println(reverseNumber);
	}

}
