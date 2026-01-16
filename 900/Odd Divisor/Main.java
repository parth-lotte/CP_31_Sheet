import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static String solve(int n) {

        while(n % 2 == 0)
            {
                n /= 2;
            }

            if( n > 1)
                {
                    return "YES";
                }
        return "NO";
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
           

            String answer = solve(n);
            System.out.println(answer);
        }
    }
}