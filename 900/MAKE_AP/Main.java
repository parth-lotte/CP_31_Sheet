import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static String solve(int a, int b, int c) {
        
        int m = -1;
    
        // change a
        if ((2*b - c) > 0 && (2*b - c) % a == 0) {
            m = (2*b - c) / a;
        }
        // change b
        else if ((a + c) % 2 == 0 && ((a + c) / 2) % b == 0) {
            m = (a + c) / (2 * b);
        }
        // change c
        else if ((2*b - a) > 0 && (2*b - a) % c == 0) {
            m = (2*b - a) / c;
        }
    
        if (m == -1) {
            return "No";
        } else {
            return "Yes";
        }
    }
    

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            String answer = solve(a, b, c);
            System.out.println(answer);
        }
    }
}