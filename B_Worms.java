import java.util.*;

public class B_Worms {

    public static int lowerBound(int arr[], int val) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= val) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans + 1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int arr[] = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
            arr[i] = sum;
        }

        int m = sc.nextInt(); 
        for (int i = 0; i < m; i++) {
            int worm = sc.nextInt(); 
            int pile = lowerBound(arr, worm);
            System.out.println(pile);
        }

        sc.close();
    }
}
