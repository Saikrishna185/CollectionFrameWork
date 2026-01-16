package setType.hashSet;

import java.util.HashSet;
import java.util.Scanner;

public class TwoArraysSameElementHashSet {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // TODO: Read the number of elements in the first array (n1)
        int n1 = sc.nextInt();
        // TODO: Create a HashSet to store unique elements from the first array
        HashSet<Integer> set1 = new HashSet<>();
        for(int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }
        // TODO: Read the number of elements in the second array (n2)
        int n2 = sc.nextInt();
        // TODO: Create a HashSet to store unique elements from the second array
        HashSet<Integer> set2 = new HashSet<>();
        for(int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }
        // TODO: Check if the two sets are equal
        if(set1.equals(set2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
        
        // Wrong Logic
//        int count1 = 0;
//        for(int i : set1) {
//            if(set2.contains(i)) {
//                count1++;
//            }
//        }
//        int count2 = 0;
//        for(int i : set2) {
//            if(set1.contains(i)) {
//                count2++;
//            }
//        }
    
    }
}
