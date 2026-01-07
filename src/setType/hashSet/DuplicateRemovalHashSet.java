package setType.hashSet;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateRemovalHashSet {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // TODO: Read the number of elements in the array (n)
        int n = sc.nextInt();
        // TODO: Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();
        // TODO: Add the array elements to the HashSet
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        // TODO: Print the unique elements in any order
        System.out.println(set);
        
        sc.close();
    }
}
