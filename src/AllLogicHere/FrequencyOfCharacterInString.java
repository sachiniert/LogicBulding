package AllLogicHere;

import java.util.HashMap;

public class FrequencyOfCharacterInString {

	public static void main(String[] args) {
		// very important question
		String input = "madam";
		HashMap<Character, Integer> frequencyMap = new HashMap<Character, Integer>();

		// how to convert a String to a char array
		char inputArray[]  = input.toCharArray();
		
		//traverse this char array ??
		for(char character: inputArray) {
			//map me  value put karne ke liye
			frequencyMap.put(character, frequencyMap.getOrDefault(character, 0)+1);
			
			
		}
		for( char c : frequencyMap.keySet()) {
			
			System.out.println(c + "  "+ frequencyMap.get(c));
		}
	}

}
