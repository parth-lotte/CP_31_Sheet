import java.util.*;

public class Main {
    
    public static int solve(int n, int h, int arr[])
    {
        int abvHeight = 0;
        int belHeight = 0;
        for(int val : arr)
        {
            if( val > h)
            {
                abvHeight+=2
            }else 
            {
                belHeight+=1;
            }
        }

        return abvHeight + belHeight;

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            int h = sc.nextInt();

            int arr[] = new int[n];

            for(int i = 0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }

            return solve(n, h, arr);
        
    }
}