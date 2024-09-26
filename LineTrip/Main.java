import java.util.*;

public class Main {
    
    public static int solve(int n, int x, int arr[])
    {
        // max val formula  for n gas 
    
        
       int  maxVal = Math.max(arr[0] - 0, 2* (x - arr[n-1]));
        
        // now traverse from 1 to n 
        
        for(int i = 1; i < n ; i++)
        {
            maxVal = Math.max(maxVal, arr[i] - arr[i-1]);
        }
        return maxVal;
    }
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);        
        // take the inputs 
        
        int t = sc.nextInt();
        
        while(t-->0)
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
            
            int arr[] = new int[n];
            
            for(int i = 0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }
            
            int res = solve(n,x,arr);
            
            System.out.println(res);
        }
        
        
    }
}