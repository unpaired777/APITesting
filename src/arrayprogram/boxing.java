package arrayprogram;

public class boxing {

	public static void main(String[] args) {
		int a =10;
		System.out.println("Primitive "+a);
		Integer i =a; //Auto Boxing 
		System.out.println("Non primitive "+i);
		System.out.println("toString() "+i.toString());
		Integer i1 =Integer.valueOf(50);
		System.out.println(i1.toString());
	}

}
