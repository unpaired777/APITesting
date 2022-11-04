package arrayprogram;

public class Unboxing {

	public static void main(String[] args) {
		Integer i =30; // Auto Boxing 
		System.out.println("i " + i.toString());
		int a = i;// Auto Boxing 
		System.out.println("a "+a);
		int b=i.intValue(); // Explicit Unboxring
		System.out.println("b "+b);
		
	}
}
