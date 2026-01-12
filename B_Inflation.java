import java.util.*;

public class B_Inflation {

    public static boolean isValid(long target, int[] arr, int k) {
        long sum = arr[0] + target;

        for (int i = 1; i < arr.length; i++) {
            long maxAllowed = (sum * k) / 100;
            if (arr[i] > maxAllowed) {
                return false;
            }
            sum += arr[i];
        }

        return true;
    }

    public static long solve(int[] arr, int n, int k) {
        long low = 0;
        long high = (long)1e15; // Upper bound based on max value * length
        long ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (isValid(mid, arr, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(solve(arr, n, k));
        }
    }
}
