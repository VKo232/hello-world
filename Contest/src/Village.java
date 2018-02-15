import java.util.*;

public class Village {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] d = new int[a];
 		for(int i = 0; i < a; i++) {
			d[i] = sc.nextInt();
		}
 		Arrays.sort(d);
 		double c = (d[2] - d[0]) / 2.0;
 		
 		for(int i = 0; i < d.length - 2; i++) {
 			double x = (d[i + 2] - d[i]) / 2.0;
 			if(x < c) {
 				c = x;
 			}
 		}
 		System.out.printf("%.1f",c);
 		
	}
}

