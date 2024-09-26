package GoalsOfVicotry;
import java.util.*;
public class  {
    public static void  solve(int n, ArrayList<Integer> list)
    {
        
        int sum = 0;
        
        for(int ele : list)
        {
            sum+=ele;
        }
        
        System.out.println(-sum);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-->0)
        {
            int n = sc.nextInt(); // 
            sc.nextLine();
            
           ArrayList<Integer> list = new ArrayList<>();
           
           for(int i = 0; i<n-1; i++)
           {
               list.add(sc.nextInt());
           }
           
             solve(n, list);
            
        }
        
    }
}