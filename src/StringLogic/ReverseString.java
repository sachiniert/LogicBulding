package StringLogic;

import java.util.Scanner;

public class ReverseString{

	public static void main(String[] args) {
		String rev;
		
		String rev2 ="";
		System.out.println("Enter String: ");
		Scanner sc = new Scanner(System.in);
		rev=sc.nextLine();
		
		for(int i= rev.length()-1; i>=0; i--) {
			rev2 = rev2+rev.charAt(i);
		}
		System.out.println(rev2);
		
		
	}

}
