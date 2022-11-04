package arrayprogram;

public class interview {
public static void main(String[] args) {
	int [] a = {5,8,9,7,6};
	int k = 4;
	int sum = 0;
	for (int i = 0; i < a.length; i++) {
		sum = sum +(a[i]%k);
	}
	System.out.println(sum);
}
}
