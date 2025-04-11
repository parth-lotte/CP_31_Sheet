package 900.JellyFish & UnderTale;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            int n = sc.nextInt(); // Array size must be int.

            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            long ans = b - 1;
            long c = 1; // Explicitly using long.

            for (int i = 0; i < arr.length; i++) {
                ans = ans + Math.min(c + arr[i], a) - 1;
            }
            System.out.println(ans + 1);
        }
    }
}

