import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_Queries_about_less_or_equal_elements {
    
public static int binarySearch(int arr[], int target)
{
    int low = 0;
    int high = arr.length;

    int ans = 0;

    while(low <high)
    {
        int mid = low + (high - low)/ 2;

        if(arr[mid] <= target)
        {
            low = mid + 1;
        }else 
        {
            high = mid;
        }
    }
    return low;
}
    public static int[] solve(int a[], int b[], int n, int m)
    {
        int sortedArr[] = a.clone();
        int answer[] = new int[m];

        Arrays.sort(sortedArr);

        for(int i = 0; i<m; i++)
        {
            answer[i] = binarySearch(sortedArr, b[i]);
        }
        return answer;
    }
   public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    
    int[] arr1 = new int[n];
    int[] arr2 = new int[m];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
        arr1[i] = Integer.parseInt(st.nextToken());
    }

    st = new StringTokenizer(br.readLine());
    for (int j = 0; j < m; j++) {
        arr2[j] = Integer.parseInt(st.nextToken());
    }

    int[] ans = solve(arr1, arr2, n, m);

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < m; i++) {
        sb.append(ans[i]).append(" ");
    }

    System.out.println(sb.toString());
}

}