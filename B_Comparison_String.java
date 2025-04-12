import java.util.*;

public class B_Comparison_String {
    
    public static int solve(String s, int n) {
        int count = 1;
        int curr = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
            } else {
                curr = 1;
            }
            count = Math.max(count, curr);
        }

        return count + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next(); 

            int result = solve(s, n);
            System.out.println(result);
        }

        sc.close();
    }
}
