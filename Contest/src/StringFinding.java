import java.io.*;
import java.util.*;

public class StringFinding {
    public static void main(String[] args) {
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    try {
        String s = sc.readLine();
        String x = sc.readLine();
        int b = x.length();
        char[] d = s.toCharArray();
        int c = 0;
        
        for(int i =0; i < x.length();i++) {
        	c+= (int) x.charAt(i);
        }
        if(b > 0 && s.length()> 0 && s.length() >= b) {
        for(int i = b - 1; i < s.length(); i++) {
        	int e = 0;
        	for(int j = i; j > i-b; j++) {
        		e+= (int) s.charAt(i);
        	}
        	if(e == c) {
                if(s.substring(i - b +1 , i+ 1).equals(x)) {
                    System.out.print(i - b + 1);
                    System.exit(0);
                }
            }
            
        }
        System.out.println(-1);
        } else {
            System.out.println(-1);
        }
        
    } catch(IOException e) {
        
    }

    
    
    
    

        
    }
}
