import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_01_Game {

    public static String solve(String s) {
        
        int zero = 0, one = 0;

        for(char ch : s.toCharArray())
            {
                if(ch == '0')
                    {
                        zero++;
                    }else 
                        {
                            one++;
                        }
            }

            int ans = Math.min(zero, one);
            if(ans % 2 == 0)
                {
                    return "NET";
                }
                return "DA";
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String s = st.nextToken();
            

            String answer = solve(s);
            System.out.println(answer);
        }
    }
}