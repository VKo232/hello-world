import java.util.*;

public class Sunflower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		  int t = 0;
		  int y =0;
		  while(y != -1) {
		      y = s.indexOf(" ", y + 1);
		      t++;   
		  }
			int[] c = new int[row*t];
			Scanner scan = new Scanner(s);
		for(int i = 0; i < t; i++) {
			c[i] =scan.nextInt();

		}
		for(int i = 0; i < t * row -t; i++) {
			c[i + t ] = sc.nextInt();
		}
		//System.out.println(Arrays.toString(c));
		int column = c.length / row;
		int[][] e = new int[row][column];
		int f = 0;
		for(int i = 0; i < row; i++) {
			
			for(int j = 0; j < column; j++) {
				e[i][j] = c[f];
				f++;
			}
		}
		int[][] k;
		int x = e[0][0];
		if(e[0][e[0].length -1] < x ) {
			x = e[0][e[0].length -1];
		} 
		if(e[e.length- 1][0] < x) {
			x = e[e.length- 1][0];
		}
		if(e[e.length-1 ][e[0].length- 1] < x) {
			x = e[e.length- 1][e[0].length- 1];
		}
		
		
		
		for(int i = 0; i < 3; i++) {
			if(e[0][0] == x) {
				break;
			}
		e =flip(c, e.length, e[0].length, e);

		}
		show(e);
	}
	public static int[][] flip(int[] c, int row, int column, int[][] e) {
		int f =0;
		for(int i = column -1; i >=0; i--) {
			for(int j = 0; j < row; j++) {
				c[f] = e[j][i];
				f++;
			}
		}
		e = set(column, row, c, e);
		return e;
	}
	public static int[][] set(int row, int column, int[] c, int[][] e) {
		int f = 0;
		int[][] k = new int[row][column];
		for(int i = 0; i < row; i++) {
			
			for(int j = 0; j < column; j++) {
				k[i][j] = c[f];
				f++;
			}
		}
		return k;
		
		
		
	}
	public static void show(int[][] e) {
		for(int i = 0; i < e.length; i++) {
			for(int j = 0; j < e[0].length; j++) {
				System.out.print(e[i][j]+ " ");
			}
			System.out.println("");

		}
	}
}



