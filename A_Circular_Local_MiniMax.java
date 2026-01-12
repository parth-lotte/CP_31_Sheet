import java.util.*;

public class A_Circular_Local_MiniMax {
    
    public static String solve(int arr[], int n, int newArr[])
    {
        int[] sortedArr = arr.clone(); // Clone to avoid modifying original input
        Arrays.sort(sortedArr);

        int j = 0;
        int k = n / 2;

        for (int i = 0; i < n; i++)
        {
            if (i % 2 == 0)
            {
                newArr[i] = sortedArr[j++];
            }
            else 
            {
                newArr[i] = sortedArr[k++];
            }
        }

        // Check circular local minima/maxima
        for (int i = 0; i < n; i++)
        {
            int prev = newArr[(i - 1 + n) % n];
            int next = newArr[(i + 1) % n];

            if ((newArr[i] > prev && newArr[i] > next) || (newArr[i] < prev && newArr[i] < next))
            {
                continue;
            }
            else 
            {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            int newArr[] = new int[n];
            String ans = solve(arr, n, newArr);
            System.out.println(ans);
            if (ans.equals("YES"))
            {
                for (int i = 0; i < newArr.length; i++)
                {
                    System.out.print(newArr[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
