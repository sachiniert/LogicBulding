package AllLogicHere;

public class FindSecondLargestNumberInArray {

	public static void main(String[] args) {
		int a[]= {1,2,4,5,6,7};
		int largestNumber = Integer.MIN_VALUE;
		int secondLagrestNumber = Integer.MIN_VALUE;
		
		for(int number : a) {
			
			if(number > largestNumber) {
				
				secondLagrestNumber = largestNumber;
				
				largestNumber = number;
				
			}
			else if(number > secondLagrestNumber && number != largestNumber) {
				
				secondLagrestNumber = number;
			}
		}
		System.out.println("SecondLargest Number is : "+ secondLagrestNumber);

	}

}
