package Dorremyspaint;
import java.util.*;

public class Main {
    public static String doremyPaint(int n, int arr[]) {
        // Use a HashMap to count the frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        if (map.size() > 2) {
            return "No";
        }
        
        if (map.size() == 1) {
            return "Yes";
        }
        
        int fq1 = -1;
        int fq2 = -1;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (fq1 == -1) {
                fq1 = e.getValue();
            } else {
                fq2 = e.getValue();
            }
        }
        
        if (Math.abs(fq1 - fq2) > 1) {
            return "No";
        }
        
        return "Yes";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            String answer = doremyPaint(n, arr);
            System.out.println(answer);
        }
        
        sc.close();
    }
}