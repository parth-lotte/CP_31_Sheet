import java.io.*;
import java.util.*;

public class Main {

    public static long[] solve(int n, int[] arr, long x) {

        // MAX BEAUTY (no merges)
        long maxBeauty = 0;
        for (int val : arr) {
            maxBeauty += (val + x - 1) / x;   // correct ceil
        }
    
        // MIN BEAUTY (merge everything)
        long totalSum = 0;
        for (int val : arr) {
            totalSum += val;
        }
    
        long minBeauty = (totalSum + x - 1) / x;  // ceil(totalSum / x)
    
        return new long[]{minBeauty, maxBeauty};
    }
    

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long x = Long.parseLong(st.nextToken());

            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            long[] ans = solve(n, arr, x);
            out.append(ans[0]).append(" ").append(ans[1]).append("\n");
        }

        System.out.print(out.toString());
    }
}
