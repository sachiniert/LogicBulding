package AllLogicHere;

public class LengthOfLastWordInString {

	public static void main(String[] args) {
		String s = "      Hello world     mood       ";
		System.out.println(s);
		//s=s.trim(); // ye white space ko remove kar deta hai word ke pahle and last me bich me nhi karta remove white space
		System.out.println(s);
		int count =0;

	char inputArray[] = s.toCharArray();// white space remove karne ke bad bachi string ko "toCharArray()" inputArray me stroe kar dega
	
	for(int i=inputArray.length-1; i>=0; i--){
		if(inputArray[i] != ' '){
			count = count + 1;
			
		}else{
			if(count > 0)
			{
				System.out.println(count);
				break;
			}
		}
	}
	
	}

}
