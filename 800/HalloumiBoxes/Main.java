package HalloumiBoxes;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
public class Main {
    public static boolean solve(int n, int k, List<Integer> list)
    {
        if( k == 1)
        {
            List<Integer> a = new ArrayList<>(list);
            Collections.sort(a);
            for(int i = 0; i<n ; i++)
            {
                if(!list.get(i).equals(a.get(i)))
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-->0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            List<Integer> list = new ArrayList<>(n);
            
            for(int i = 0; i<n; i++)
            {
                list.add(sc.nextInt());
            }
            if(solve(n,k, list))
            {
                System.out.println("YES");
        
            }else 
            {
                System.out.println("NO");
            }
            
        }
        
    }
}