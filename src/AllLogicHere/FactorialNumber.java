package AllLogicHere;

import java.math.BigInteger;

public class FactorialNumber {

	public static void main(String[] args) {
		int number =50;// if we assign number 0 it is given result 1 and if we assign big number like 12345654 it not given correct because out of range in int so we use another method
		
		// int number = 50 code fatt jayega range se bahar chla jayega data
		
		//int result = 1;  it is not working in big data
		 // isko sahi karne ke liye bigInteger datatype use karege 
		
		BigInteger result = BigInteger.ONE;
		for(int i=1; i<=number;i++)
		{
		//   result = result * i;
			result = result.multiply(BigInteger.valueOf(i));
			
		}
		System.out.println(result);

	}

}
