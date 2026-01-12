import java.util.*;

public class B_Books {

    public static int maxBooks(int[] arr, int n, int t) {
        int left = 0, right = 0;
        int currentSum = 0;
        int maxBooks = 0;

        while (right < n) {
            currentSum += arr[right];

            while (currentSum > t) {
                currentSum -= arr[left];
                left++;
            }

            maxBooks = Math.max(maxBooks, right - left + 1);
            right++;
        }

        return maxBooks;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = maxBooks(arr, n, t);
        System.out.println(result);
    }
}
