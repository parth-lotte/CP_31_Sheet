import java.util.*;

public class B_Permutation_Swap {
    
    public static int gcd(int a, int b) {

        if(b == 0)
        {
            return a;
        }
        return gcd(b, a%b);
    }
    public static int solve(int arr[], int n)
    {
        int k = Math.abs(arr[0] - 1);

        for(int i = 1; i<n; i++)
        {
            k =  gcd(k, Math.abs(arr[i] - (i+1)));
        }
        return k;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }
            int result = solve(arr, n);
            System.out.println(result);
        }
    }
}