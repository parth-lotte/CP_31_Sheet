import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static long solve(long x, long n) {

        long remStep = n - (n % 4) + 1;

        while (remStep <= n) {
            if (x % 2 == 0) {
                x -= remStep;
            } else {
                x += remStep;
            }
            remStep++;
        }
        return x;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            long x = Long.parseLong(st.nextToken());
            long n = Long.parseLong(st.nextToken());

            long answer = solve(x, n);
            System.out.println(answer);
        }
    }
}
