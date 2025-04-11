package Forked;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input values for a and b
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Input the king's position
        int xk = sc.nextInt();
        int yk = sc.nextInt();
        
        // Input the queen's position
        int xq = sc.nextInt();
        int yq = sc.nextInt();
        
        // Define the 8 possible directions
        int[][] directions = {
            {a, b}, {a, -b}, {-a, b}, {-a, -b},
            {b, a}, {b, -a}, {-b, a}, {-b, -a}
        };
        
        // Sets to store attacking positions for king and queen
        Set<String> st1 = new HashSet<>();
        Set<String> st2 = new HashSet<>();
        
        // Compute and store all attacking positions for both king and queen
        for (int[] d : directions) {
            int x = xk + d[0];
            int y = yk + d[1];
            st1.add(x + "," + y); // Store positions in "x,y" format for easy comparison
            
            x = xq + d[0];
            y = yq + d[1];
            st2.add(x + "," + y);
        }
        
        // Count common attacking positions between king and queen
        int ans = 0;
        for (String pos : st1) {
            if (st2.contains(pos)) {
                ans++;
            }
        }
        
        // Output the result
        System.out.println(ans);
    }
}
