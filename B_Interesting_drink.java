import java.util.*;

public class B_Interesting_drink {
    
    public static int solve(int arr[], int q, int n, int target)
    {
        Arrays.sort(arr);

        int ans = 0;
        int low = 0;
        int high = arr.length - 1;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            if(arr[mid] <= target)
            {
                ans = mid + 1;
                low = mid + 1;
            }else 
            high = mid - 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        
        // while(t-->0)
        // {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }
            int q = sc.nextInt();
            while(q -- > 0)
            {  
                int target = sc.nextInt();
                int ans = solve(arr, q, n, target);
                System.out.println(ans);
            }
            
        // }
    }
}