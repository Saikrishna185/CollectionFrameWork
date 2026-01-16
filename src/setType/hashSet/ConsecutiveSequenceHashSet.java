package setType.hashSet;

import java.util.HashSet;
import java.util.Scanner;

public class ConsecutiveSequenceHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // TODO: Read the number of elements in the array (n)
        int n = sc.nextInt();
        // TODO: Use a HashSet to store unique elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // TODO: Find the longest consecutive sequence
        int lcs = consecutiveSequence(arr);
        System.out.println(lcs);
        
        sc.close();
    }
    
    public static int consecutiveSequence(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        
        int count = 0;
        for(int i : arr) {
            if(!set.contains(i-1)){
                int current = i;
                int len = 0;
                while (set.contains(current)) {
                    current++;
                    len++;
                }
                if(len > count){
                    count = len;
                }
            }
        }
     return count;
    }
}
