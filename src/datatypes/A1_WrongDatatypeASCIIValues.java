package datatypes;

public class A1_WrongDatatypeASCIIValues {
	
	public static void main(String[] args) {
		
		int i = 1;  // correct format
		int j = 2; // correct format
		int k = 'a'; // wrong datatype, stored as ASCII Value
		int l = 'b';
	    
		
		char a= '1'; // stores as ASCII value
		char b= '2';
		char c= 'a'; 
		char d= 'b';
		
		
		System.out.println(i);
		System.out.println(k);
		System.out.println(i+k);

		System.out.println(a);
		System.out.println(c);
		System.out.println(a+c);
	
		int z = a; // char must be specified within quotes, else provide random result
		System.out.println(z);

		
		
		
		
	}

}
