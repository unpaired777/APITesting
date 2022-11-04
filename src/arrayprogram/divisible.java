package arrayprogram;
//WAP to find the total number of decrements opration to make each 
// elements of the array divisible by k.
public class divisible {
	public static void main(String[] args) {
		int [] a = {5,9,12,16,25};
		int k = 6;
		int sum =0;
		for (int i = 0; i < a.length; i++) {
			sum =sum +(a[i]%k);
		}
		System.out.println(sum);
	}

}
