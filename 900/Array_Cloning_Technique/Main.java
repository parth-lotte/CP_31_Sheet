import java.io.*;
import java.util.*;

public class Main {

    
    public static int solve(int n, int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++)
            {
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            }

            int freq = Integer.MIN_VALUE;
            // find the max val 
            for(Map.Entry<Integer, Integer> e : map.entrySet())
                {
                    freq = Math.max(freq, e.getValue());
                }
                int op = 0;

                while(freq < n)
                    {
                        op++;
                        if(n - freq >= n)
                            {
                                op+= freq;
                                freq*=2;
                            }else 
                                {
                                    op += n - freq;
                                    freq = n;
                                }
                    }
        return op;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());  
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());  
            int[] arr = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int answer = solve(n, arr);
            System.out.println(answer);
        }
    }
}