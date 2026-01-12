import java.util.*;

public class B_Not_Dividing {
    
    public static void solve(int arr[], int n)
    {

        for(int i = 0; i<n; i++)
        {
            if(arr[i] == 1)
            {
                arr[i]++;
            }
        }
        for(int i = 0; i<n-1; i++)
        {
            if(arr[i+1] % arr[i] == 0)
            {
                arr[i+1]++;
            }
        }

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
            solve(arr,n);

            for(int e : arr)
            {
                System.out.print(e+" ");
            }
            System.out.println();

        }
    }
}