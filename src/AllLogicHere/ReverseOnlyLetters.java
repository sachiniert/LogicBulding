package AllLogicHere;

import java.util.Arrays;

public class ReverseOnlyLetters {

	public static void main(String[] args) {
		String input = "1ab2"; //1ba2
		int left =0; // array me left me 0 index pe hai zero pointer 1 
		int right = input.length()-1; //  right me 3 pe index pe aayega pointer2
		char inputArray[] = input.toCharArray(); // input string ko array me convert karega
		
		while(left < right) {
			
			if(!Character.isLetter(inputArray[left])) {
				
				left++;   // array me aage shift hoga agar letter nhi mila to
			}
			else if(!Character.isLetter(inputArray[right])) {
				
	           right--;   // right me  letter nhi hoga to aage shift karega
                }
			else {
				//swap 
				char temp;
				temp = inputArray[left];
				inputArray[left] = inputArray[right];
				inputArray[right] = temp;
//				left++;
//				right--;
			}
			System.out.println("output "+ Arrays.toString(inputArray));
			System.out.println("output " + new String(inputArray));
		}

	}

}
