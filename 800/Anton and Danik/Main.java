// package 800.Anton and Danik;

import java.util.*;

public class Main {
    
    public static String solve(String str)
    {
        int countA = 0;
        int countB = 0;

        for(char c : str.toCharArray())
        {
            if (c == 'A')
            {
                countA++;
            }else {
                countB++;
            }
        }

        if(countA > countB)
        {
                return "Anton";
        }else if(countB > countA)
        {
            return "Danik";
        }else 
        return "Friendship";
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0)
        {
            String str = sc.nextLine();
            String ans = solve(str);

            System.out.println(ans);
        }
    }
}