package DaytonasCost;
import java.util.*;
public class Main {
    public static void  solve(int n, int k, int arr[])
    {
        
        for(int e : arr)
        {
            if( e == k)
            {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-->0)
        {
            int n = sc.nextInt(); // x length
            int k = sc.nextInt(); // s length
            
            sc.nextLine();
            
           int arr[] = new int[n];
           
           for(int i = 0; i<arr.length; i++)
           {
               arr[i] = sc.nextInt();
           }
           
             solve(n, k, arr);
            
        }
        
    }
}