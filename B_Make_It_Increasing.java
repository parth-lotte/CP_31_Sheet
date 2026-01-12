import java.util.*;

public class B_Make_It_Increasing {
    
    public static int  solve(int arr[], int n)
    {
        int count = 0;

        for(int i = n - 2; i>=0; i--)
        {
            while(arr[i] >= arr[i+1])
            {
                if(arr[i] == 0)
                {
                    break;
                }
                count++;
                arr[i]/=2;
                
            }
            if(arr[i] == 0 && arr[i+1]==0)
            {
                count = -1;
                break;
            }
        }
        return count;
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
           int ans =  solve(arr,n);
           System.out.println(ans);
        }
    }
}