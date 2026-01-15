import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            // Proper swap
            if (a > b) {
                long temp = a;
                a = b;
                b = temp;
            }

            long ans = b - a;

            if (ans == 0) {
                System.out.println(0+" "+0);
            } else {
                long one = ans - (a % ans);
                long two = a % ans;
                System.out.println(ans +" "+ Math.min(one, two));
            }
        }
    }
}
