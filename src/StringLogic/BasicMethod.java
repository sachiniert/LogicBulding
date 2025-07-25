package StringLogic;

public class BasicMethod {

	public static void main(String[] args) {
		String a = "SAPP";
		String b = "sap";
		String c = "  Sachin ";
		String d ="";
		
		//to convet lower case use toLowerCase()
		System.out.println(a.toLowerCase());
		//to convert uper case use toUpperCase()
		System.out.println(b.toUpperCase());
		//check string length use length()
		System.out.println(a.length());
		//concate two or more string use concat()
		System.out.println(b.concat(a));
		//trim string use trim()
		System.out.println(c.trim());
		// isEmpty
		System.out.println(d.isEmpty());
		// charAt() return index value
		System.out.println(a.charAt(2));
		// indexof() check index using character
		System.out.println(b.indexOf('p'));
		// equals() 
		System.out.println(a.equals(b));
		// replace character
		System.out.println(a.replace('S', 'R'));
		
	}

}
