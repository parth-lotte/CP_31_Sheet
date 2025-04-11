package 900.Longest Divisors Interval;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while (t-->0) {
        
        Long n = sc.nextLong();
        
        int count = 0;

        for(int i = 1; i < n+1 ; i++)
        {
           if( n % i !=0)
           {
            break;
           }
           count++;
        }
        System.out.println(count);
            
        }
    }

}

