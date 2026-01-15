import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {

            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            long one = 0, zero = 0;  

            while (n-- > 0) {
                int val = Integer.parseInt(st.nextToken());

                if (val == 1) one++;
                else if (val == 0) zero++;
            }

            long ans = (1L << zero) * one; 
            System.out.println(ans);
        }
    }
}
