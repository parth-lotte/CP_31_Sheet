import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_Multiply_by_2_divide_by_6 {

    public static long solve(long n) {
            
            int count  = 0;
    
            while( n!= 1)
                {
            if( n % 6 == 0)
                {
                    n/=6;
                    count++;
                }else if( n % 3 == 0)
                    {
                        n*=2;
                    count++;
                }else 
                    {
                      return -1;
                    }
                }
                    return count;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            long n = Long.parseLong(st.nextToken());
            
            long  answer = solve(n);
            System.out.println(answer);
        }
    }
}