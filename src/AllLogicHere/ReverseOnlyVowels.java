package AllLogicHere;

public class ReverseOnlyVowels {

	public static void main(String[] args) {
		String input = "Hello";  //Holle
		String vowelsString = "aeiouAEIOU";
		
		char inputArray[] = input.toCharArray();// convert string to array 
		int left =0; // pointer 1 , 0 index
		int right = inputArray.length-1; // pointer 2 , last index
		
		while(left < right) 
		// 50 50 done by both pointer
			{
			
			if(vowelsString.indexOf(inputArray[left])==-1)
			//indexOf(inputArray[left] ->H vowels nhi to uska index -1
			{
				left++;
				
			}
			else if(vowelsString.indexOf(inputArray[right])==-1)
			//right jisko point kar rha hai agar o vowel nhi 
			{
				right--;
				
			}else
			{
				char temp;
				temp = inputArray[left];
				inputArray[left]= inputArray[right];
				inputArray[right] = temp;
				left++;
				right--;
				
			}
		}
	
		System.out.println("Output "+new String(inputArray));

	}

}
