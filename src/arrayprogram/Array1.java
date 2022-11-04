package arrayprogram;

public class Array1 {
public static void main(String[] args) {
	int [] a = {1,5,4,2,3};
	int large = Integer.MIN_VALUE;
	for (int i = 0; i < a.length; i++) {
		if (a[i]>large) {
		large = a[i];	
		}
	}
	System.out.println(large);
}
}
