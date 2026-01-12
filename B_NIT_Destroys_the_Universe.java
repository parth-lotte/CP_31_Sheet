import java.util.*;

public class B_NIT_Destroys_the_Universe {

    public static int solve(int arr[], int n) {
        int countZero = 0;

        for (int val : arr) {
            if (val == 0) {
                countZero++;
            }
        }

        // If all elements are zero
        if (countZero == n) {
            return 0;
        }

        int left = 0;
        int right = n - 1;

        // Skip leading zeros
        while (left < n && arr[left] == 0) {
            left++;
        }

        // Skip trailing zeros
        while (right >= 0 && arr[right] == 0) {
            right--;
        }

        // Check for any zero in the trimmed array
        for (int i = left; i <= right; i++) {
            if (arr[i] == 0) {
                return 2;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int ans = solve(arr, n);
            System.out.println(ans);
        }
    }
}
