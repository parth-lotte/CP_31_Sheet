package DontryTocount;
import java.util.*;
public class Main {
    public static void  solve(String x, int n, String s, int m)
    {
        int count = 0;
        for(int i = 0; i <=10; i++)
        {
            if(x.contains(s))
            {
                System.out.println(i);
                return;
            }
            x+=x;
        }
        System.out.println(-1);
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-->0)
        {
            int n = sc.nextInt(); // x length
            int m = sc.nextInt(); // s length
            
            sc.nextLine();
            
            String x = sc.nextLine();
            String s = sc.nextLine();
            
             solve(x,n, s, m);
            
           
            
        }
        
        
    }
}