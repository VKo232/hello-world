import java.io.*;
import java.util.*;

public class StringFinding {
    public static void main(String[] args) {
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    try {
        String s = sc.readLine();
        String x = sc.readLine();
        int b = x.length();
        int c = Integer.valueOf(x);
        if(b > 0 && s.length()> 0 && s.length() >= b) {
        for(int i = b - 1; i < s.length(); i++) {
        	if(Integer.valueOf(s.substring(i - b +1 , i+ 1)) == c) {
                if(s.substring(i - b +1 , i+ 1).equals(x)) {
                    System.out.print(i - b + 1);
                    break;
                }
            }
            if(i == s.length() -1) {
              System.out.println(-1);
            }
        }
        } else {
            System.out.println(-1);
        }
        
    } catch(IOException e) {
        
    }
    }
}
