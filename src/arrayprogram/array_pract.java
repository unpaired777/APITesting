package arrayprogram;

public class array_pract {
public static void main(String[] args) {
	int [][] a = {{4,5,6},{8,4,9},{2,8,6}};
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.print(a[j][i]+" ");
		}
		System.out.println();
	}
}
}
