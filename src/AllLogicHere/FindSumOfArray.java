package AllLogicHere;

public class FindSumOfArray {

	public static void main(String[] args) {
		// array is alway store in  heap memory
		
		int numbers[] = {1,24,33,44};
		int sum =0 ;
		
//		for(int index =0; index <= numbers.length-1; index++)
//		{
//			
//			sum = sum + numbers[index];
//		}
		
		for(int number : numbers) {
			
			sum = sum + number;
		}
		

		System.out.println(sum);
	}

}
