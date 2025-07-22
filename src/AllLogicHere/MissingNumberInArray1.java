package AllLogicHere;

public class MissingNumberInArray1 {

	public static void main(String[] args) {
		int numbers[]= {1,2,4,5,6};
		int totalNumbers =6;
		int totalSumofAllNumbers= (totalNumbers*(totalNumbers+1))/2;
		System.out.println(totalSumofAllNumbers);// 21 
		
		// calculate sum of the given array
		
		int sumofArray =0;
		for(int i=0; i<numbers.length;i++)
		{
			sumofArray= sumofArray+numbers[i];
		}
		System.out.println(sumofArray);// 18
		
		System.out.println("The missing number is :" +(totalSumofAllNumbers-sumofArray));
	}

}
