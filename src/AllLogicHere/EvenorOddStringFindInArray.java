package AllLogicHere;

public class EvenorOddStringFindInArray {

	public static void main(String[] args) {
		//isme se hame even strng find karni hai
		String input = "sky is blue and vast";
		
		// below line remove space and stroe string only in dataArray 
		String dataArray[]= input.split(" ");
		
		for(String word : dataArray) {
			if(word.length()%2 ==0) {
				
				System.out.println(word);
			}
			
			
		}
		
	}

}
