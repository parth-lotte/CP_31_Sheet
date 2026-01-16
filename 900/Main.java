import java.io.*;
import java.util.*;

public class Main {

    public static void solve(int n, int[] p) {
        
        for(int i = 0; i< n-2; i++)
            {
                if( p[i] < p[i+1] && p[i+1] > p[i+2])
                    {
                        System.out.println("YES");
                    }
            }
        System.out.println("NO");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            int[] p = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                p[i] = Integer.parseInt(st.nextToken());
            }

            solve(n, p);
        }
    }
}
