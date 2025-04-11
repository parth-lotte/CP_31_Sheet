import java.util.*;

public class Main {
    
    public static String solve(String str1, String str2)
    {
        int i = 0;
        int j = str2.length() - 1;

        while(i < str1.length() && j >=0)
        {
            if(str1.length() != str2.length())
            {
                return "NO";
            }
            if(str1.charAt(i) != str2.charAt(j))
            {
                return "NO";
            }
            i++;
            j--;
        }
        return "YES";
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            String ans = solve(str1, str2);

            System.out.println(ans);

    }
}