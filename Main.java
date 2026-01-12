import java.util.*;

public class Main {
    
    public static int[] solve(int n)
    {
        int max = -1, min = -1;

        if(n % 4==0 && n%6 != 0)
        {
            max = n/4;
            min = n/4;
        }else if(n % 4!=0 && n%6 == 0)
        {
            max = n/4;
            min = n/4;
        }else if(n % 4==0 && n%6 == 0)
        {
            max = n/4;
            min = n/6;
        }else 
        {
            return new int[]{-1};
        }
        return new int[]{min, max};
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0)
        {
            int n = sc.nextInt();
            int ans[] = solve(n);
            System.out.println(ans[0]+" "+ ans[1]);
        }
    }
}