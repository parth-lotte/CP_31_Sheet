package CoverInWater;
import java.util.*;

public class Main {
    
    public static int solve(int n, String str)
    {
        int ans = 0;
        for(int i = 0; i < n ; i++)
        {
            int count = 0 ;
            
            while(i < n && str.charAt(i) == '.')
            {
                count++;
                i++;
            }
            if(count > 2)
            {
                ans = 2;
                break;
            }else 
            {
                ans+=count;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);        
        // take the inputs 
        
        int t = sc.nextInt();
        
        while(t-->0)
        {
            int n = sc.nextInt();
            sc.nextLine();
            
            String str = sc.nextLine();
            
            int ans = solve( n, str );
            System.out.println(ans);

        }
        
        
    }
}