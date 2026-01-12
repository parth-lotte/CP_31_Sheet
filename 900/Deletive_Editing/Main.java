import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static String solve(String s, String t) {
        StringBuilder answer = new StringBuilder();
        int[] freq = new int[26];
    
        // Count frequency of t
        for (char ch : t.toCharArray()) {
            freq[ch - 'A']++;
        }
    
        // Traverse s from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (freq[ch - 'A'] > 0) {
                answer.append(ch);
                freq[ch - 'A']--;
            }
        }
    
        answer.reverse();
    
        if (answer.toString().equals(t)) {
            return "YES";
        } else {
            return "NO";
        }
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        
        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String t = st.nextToken();

            String answer = solve(s,t);
            System.out.println(answer);
        }
        
    }
}

