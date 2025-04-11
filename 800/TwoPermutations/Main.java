package TwoPermutations;

import java.util.*;

public class Main {
    
    public static void solve(int n, int a, int b)
    {
        if(a + b >= n - 1)
        {
            if( a == n && b == n)
            {System.out.println("YES");}else 
            {System.out.println("NO");}
            
        }else 
        {
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0)
        {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            solve(n, a, b);
        }
    }
}
