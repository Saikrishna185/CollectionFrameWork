package setType.hashSet;

import java.util.HashSet;
import java.util.Scanner;

public class ArrayIntersectionHashSet {
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
        // TODO: Find the intersection by checking elements of the second array against the HashSet
        HashSet<Integer> set2 = new HashSet<>();
        for(int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }
        // TODO: Print the common elements or "NO COMMON ELEMENTS" if there are none
        int count = 0;
        for (int i : set1) {
            if(set2.contains(i)){
                System.out.print(i);
                count++;
            }
        }
        if(count == 0) {
            System.out.println("NO COMMON ELEMENTS");
        }
        
        sc.close();
    }
}
