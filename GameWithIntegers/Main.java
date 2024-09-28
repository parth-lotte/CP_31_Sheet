package GameWithIntegers;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

public class Main {
    
    public static String solve(int n)
    {
        if(n % 3 == 0)
        {
            return "Second";
        }else 
        return "First";
    }
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);        
        // take the inputs 
        
        int t = sc.nextInt();
        
        while(t-->0)
        {
            int n = sc.nextInt();
            
            
            String ans = solve( n);
            System.out.println(ans);

        }
        
        
    }
}e