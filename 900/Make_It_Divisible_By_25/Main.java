import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static int solve(String s, int n) {
        
        int ans = n;
        for(int i = 0; i <n; i++)
            for(int j = i+1; j<n; j++)
        {
            int num = (s.charAt(i) - '0') * 10 + s.charAt(j) - '0';
            if( num % 25 == 0)
                {
                    ans = Math.min(ans, (j - i - 1) + (n - 1 - j));
                } 
        }
        return ans;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String s = st.nextToken();
            int n = s.length();

            int answer = solve(s,n);
            System.out.println(answer);
        }
    }
}